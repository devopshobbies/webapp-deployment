#!/bin/bash
#====================================================================================================================================================
server_name=$(hostname)
function create_cluster() {
    echo "Createing kind cluster... 🙃"
    ansible-playbook ansible/kind.yml -i hosts --tags "create" -e "HOSTS=localhost control_nodes=1 worker_nodes=2 cluster_name=k8s-hello" -u thedatabaseme -k -K
    echo "Cluster k8s-learn with 1 control-plan and two worket nodes created 🙂"
     kubectl config view --raw --flatten=true > kube-config.yml 
}

#====================================================================================================================================================
function delete_cluster() {
	echo "Deleteing the kind cluster... 🙁"
    kind delete cluster --name=k8s-hello
    echo "Cluster k8s-learn deleted 🙁"
}
#====================================================================================================================================================
function deploy_infrastructure() {
    echo "prepareing the infrastructure... 🧐"
    echo "Synthesizing... 😎"
    cd k8s-infrastructure && cdktf synth
    cd ..
    echo "terraform code generated 😀"
    cd k8s-infrastructure/cdktf.out/stacks/k8s-infrastructure &&
    echo "initializing terraform..."
    terraform init
    echo "terraform initialized"
    echo "planning terraform..."
    terraform plan --out plan
    echo "terraform planned"
    terraform apply
    echo "infrstructure is ready"



	
}
#====================================================================================================================================================
##
# Color  Variables
##
green='\e[32m'
blue='\e[34m'
clear='\e[0m'
##
# Color Functions
##
ColorGreen(){
	echo -ne $green$1$clear
}
ColorBlue(){
	echo -ne $blue$1$clear
}
#====================================================================================================================================================
menu(){
echo " █████   █████          ████  ████                      █████       ████████          
░░███   ░░███          ░░███ ░░███                     ░░███       ███░░░░███         
 ░███    ░███   ██████  ░███  ░███   ██████             ░███ █████░███   ░███   █████ 
 ░███████████  ███░░███ ░███  ░███  ███░░███ ██████████ ░███░░███ ░░████████   ███░░  
 ░███░░░░░███ ░███████  ░███  ░███ ░███ ░███░░░░░░░░░░  ░██████░   ███░░░░███ ░░█████ 
 ░███    ░███ ░███░░░   ░███  ░███ ░███ ░███            ░███░░███ ░███   ░███  ░░░░███
 █████   █████░░██████  █████ █████░░██████             ████ █████░░████████   ██████ 
░░░░░   ░░░░░  ░░░░░░  ░░░░░ ░░░░░  ░░░░░░             ░░░░ ░░░░░  ░░░░░░░░   ░░░░░░ "
echo -ne "
My First Menu
$(ColorGreen '1)') Create a kubernetes cluster
$(ColorGreen '2)') Delete the kubernetes cluster
$(ColorGreen '3)') prepare the infrastructure
$(ColorBlue 'Choose an option:') "
        read a
        case $a in
	        1) create_cluster ;;
            2) delete_cluster ;;
	        3) deploy_infrastructure ;;
		0) exit 0 ;;
		*) echo -e $red"Wrong option."$clear; WrongCommand;;
        esac
}
# Call the menu function
menu
#====================================================================================================================================================