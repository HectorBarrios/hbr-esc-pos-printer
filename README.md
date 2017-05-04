# HBR - ESC/POS Printer

This project is a basic template with most used ESC/POS commands. You will be able to print a ticket, cut the paper and open the cash drawer. 

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### How to use

This project is not finished, is only a template customizable for your custom TPV/POS. You will need to modify the following files to get a working version.

Set the printer name or other configuration that you will need in the service:
```
Config.java
```

Complete in the service all the TODO references.
```
PrinterService.java
```

To add a new Code use the Helper and the HexCodes:
```
PrinterHelper.java and HexCodes.java
```

Here you have an example using the Helper:
```
printStream.print(helper.alignLeft());
```

### Installing

Clone the whole project and use maven to generate the JAR file

```
clean install
```

Copy the JAR generated and use in your project.


## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Héctor Barrios Rodríguez** - [GitHub](https://github.com/HectorBarrios) - [PersonalPage](http://www.hectorbarrios.com)

## License

I don't like legal stuff... this is free and will be free. Use it, enjoy it and contribute.


