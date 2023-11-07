class ClinicStarter{
public satic void maion(String[] args)
{		doctor=new Doctor();
		
		Clinic clinic;
		clinic=new Clinic(doctor);
		
		clinic.displayInfo();
		}
		}