package haptic.join

import haptic.org.Team
import haptic.org.Employee




class Employee_Team {

    static belongsTo = [employee: Employee, team: Team]

    static Employee_Team create(Employee employee, Team team, boolean flush = false) {
        new Employee_Team(employee: employee, team: team).save(flush: flush, insert: true)
    }
}
