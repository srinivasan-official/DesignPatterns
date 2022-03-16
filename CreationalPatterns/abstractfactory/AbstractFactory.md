Abstract Factory is a creational design pattern, which solves the problem of creating entire product families without specifying their concrete classes.

Abstract Factory provides an interface for creating families of related/dependent objects(product) without specifing the concrete classes.

AbstractFactory Vs FactoryMethod:
Factory Method - Has one concrete factory class(NotificationFactory) and returns a single product(Notification)
Abstract Factory - Has many concrete factory class(MacOSFactory, LinuxOSFactory, WindowsOSFactory) and returns all the dependent product(Button, CheckBox) of the particular Factory Implementation
