# Easywall

A DSL (Domain Specific Language) to easily write firewalls.\
It has primitive types sucha as:
- `network` that accepts stuff like: `192.162.0.0/24`
- `netip` for IP address variables: `192.168.0.1`
- `netport` for network ports: `:8080` 

Just like Java and many other programming languages, Easywall has the possibility to divide files in many packages, but, just one firewall file must be created. A firewall file is a file containing (it's like a the main function, but as a "class"):
```
firewall FIREWALLNAME {
	...
}
```
It supports rules from Network Layer to Application Layer.\
Everytime you want to add a rule you need to specify at which layer the rule must work, such as:
```
rule RULENAME at TransportLayer {
    ...
}
```
Each variable defined can be either `var` for variables or `set` for constants, i.e.:
```
var VARNAME : network = 192.168.2.0/16;
set VARNAME : netip = 192.168.2.254;
```
\
\
This is my project for "Attività progettuale di linguaggi e modelli computazionali M" at the University of Bologna, Master Degree in Computer Engineering.