# Architecture

![Simulation Diagram](./diagrams/simulation.png)

## Observer

The Observer will watch the simulation and control the flow of operations. It can see all agents, all obstacles, and the goal at all times. It will inform agents about the physics they must obey. When an agent reaches the goal, it will end the simulation.

## Agent

An agent has a location, velocity, and acceleration. It's acceleration will depend on the physics of the simulation.

An agent also has an array of sensors. It will periodically check its sensors to avoid obstacles as it moves toward the goal which it can see at all times. It will forget about obstacles that it can no longer see.

## Sensor

A sensor has a range and an angular width that determine what it can see. It also has a frequency at which it will check for obstacles.

## Obstacle

Obstacles stand in the way of the agents as they move toward their goal. They can have any 2D shape and can be located anywhere in the simulation. Obstacles may not overlap.

## Goal

The Goal is the destination that the agents must reach before the simulation can end. It can have any 2D shape and can be located anywhere in the simulation. It may not overlap with obstacles.

## Physics

A model of physics will inform the observer of how to control the agents.