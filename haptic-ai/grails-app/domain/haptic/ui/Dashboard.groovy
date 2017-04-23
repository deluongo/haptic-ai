package haptic.ui
import haptic.org.KPI

class Dashboard {
    def mainLabel //Needs to reference a field in Leads such as jobTitle
    def subLabel //Needs to reference a field in Leads->Company->name
    KPI kpi1
    KPI kpi2
    KPI kpi3
    KPI kpi4
    def Target1 //Needs to reference a team quota to display current progress and end goal
    def Target2 //Needs to reference a personal quota to display current progress and end goal
    def Rank //Must reference Employee's personal, company wide sales rank (by role or job title)
    def Grade //Must reference Haptic's grade for engagement w/ the software

    static constraints = {
    }
}

