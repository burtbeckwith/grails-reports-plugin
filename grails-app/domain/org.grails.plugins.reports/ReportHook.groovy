package org.grails.plugins.reports

class ReportHook {

	String name
	Report report
	
    static constraints = {
		name shared:'uniqueString'
		report nullable: true
    }
	
	String toString(){
		return name
	}
	
	int hashCode(){
		return name.hashCode()
	}

	boolean equals(Object other){
		if(other instanceof ReportHook){
			return this.name == other.name
		}else{
			return false
		}
	}
	
}
