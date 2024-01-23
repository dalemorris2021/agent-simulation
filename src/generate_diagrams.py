import subprocess as sp

# Generates UML diagrams on Windows

def generate():
    sp.call('java -jar .\\lib\\plantuml-gplv2-1.2023.13.jar .\\doc\\uml\\*.uml -o ..\\diagrams')

if __name__ == '__main__':
    generate()
