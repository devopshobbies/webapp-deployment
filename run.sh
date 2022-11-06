
ansible-playbook kind.yml -i hosts --tags "create" -e "HOSTS=vmkind control_nodes=1 worker_nodes=2 cluster_name=mytestcluster" -u thedatabaseme -k -K