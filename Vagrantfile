# para ver as configurações das maquinas use >>> vagrant ssh-config

Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/jammy64"
  
  config.vm.define "runner-server-1" do |runner|
    runner.vm.hostname = "runner-server-1"
  end
  
  config.vm.define "runner-server-2" do |runner|
    runner.vm.hostname = "runner-server-2"
  end
  
  config.vm.synced_folder "./docker-config/traefik/", "/traefik"

  config.vm.provision "ansible" do  |ansible|
    ansible.playbook = "./ansible-playbooks/playbook.yml"
  end
end
  