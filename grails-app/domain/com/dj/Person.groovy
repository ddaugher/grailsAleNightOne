package com.dj

class Person {

	static hasMany = [addresses: Address]

	String firstName
	String lastName
	Date birthdate

    static constraints = {
    }
}
