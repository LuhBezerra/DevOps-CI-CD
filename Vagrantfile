# para ver as configurações das maquinas use >>> vagrant ssh-config

Vagrant.configure("2") do |config|

      (1..2).each do |i|
      config.vm.define "runner-#{i}" do |node|
        config.vm.box = "ubuntu/jammy64"
        node.vm.hostname = "host#{i}"
      end
    end
  end
  