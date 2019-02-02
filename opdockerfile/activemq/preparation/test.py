from jinja2 import Environment, FileSystemLoader 


env = Environment(loader = FileSystemLoader("./"))
template = env.get_template("activemq.xml") 

content = template.render(ip_1="111111111111", ip_2="2222222222222")


with open('./activemq.xml','w') as fp:
	fp.write(content)
local_ip = [(s.connect(('8.8.8.8', 53)), s.getsockname()[0], s.close()) for s in [socket.socket(socket.AF_INET, socket.SOCK_DGRAM)]][0][1]
