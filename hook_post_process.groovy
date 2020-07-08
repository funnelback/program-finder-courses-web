

transaction?.response?.resultPacket?.results.each() {
    def dep = ""
  
    switch(it.metaData.stencilsCourseDepartment) {
        case "PHYS": dep = "Physical Sciences"
        	break
        case "VISU": dep = "Visual and Performing Arts"
        	break
        case "MKTG": dep = "Marketing, International Business and Entrepreneurship"
        	break
        case "COMP": dep = "Computing Science"
        	break
        case "ACCT": dep = "Accounting and Finance"
        	break
        case "PSYC": dep = "Psychology"
        	break
        case "ESAL": dep = "English as Second or Additional Language"
        	break
        case "NRSC": dep = "Natural Resource Sciences"
        	break
        case "AGRI": dep = "Agricultural Related"
        	break
        case "LIML": dep = "English and Modern Languages"
        	break
        case "TMAN": dep = "Tourism Management"
        	break
        case "ADVS": dep = "Adventure Studies"
        	break
        case "BIOL": dep = "Biological Sciences"
        	break
        case "HEAL": dep = "Allied Health"
        	break
        case "JOUR": dep = "Journalism, Communication and New Media"
        	break
        case "LAW": dep = "Law"
        	break
        case "EDUC": dep = "Education"
        	break
        case "CONS": dep = "Construction Trades"
        	break
        case "MISC": dep = "Management"
        	break
        case "HCAS": dep = "Social Work"
        	break
        case "CULI": dep = "Culinary Arts and Retail Meat"
        	break
        case "GEOG": dep = "Geography"
        	break
        case "HUMS": dep = "Human Services"
        	break
        case "SOWK": dep = "Social Work"
        	break
        case "SWHS": dep = "Social Work"
        	break
        case "ECON": dep = "Economics"
        	break
        case "MECH": dep = "Mechanical and Welding Trades"
        	break
        case "SOAN": dep = "Sociology and Anthropology"
        	break
        case "ADEE": dep = "Architectural and Engineering"
        	break
        case "NURS": dep = "Nursing"
        	break
        case "MATH": dep = "Mathematics and Statistics"
        	break
        case "MANA": dep = "Management"
        	break
        case "PHHP": dep = "Philosophy, History and Politics"
        	break
        default: dep = "Undeclared"
  }  
  it.customData.put("dep", dep)
}