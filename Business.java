public class Business
{
    //
        private String name;
        private String organizationType;
        private String resources;
        private String contactInfo;
        private String location;
        private String cost;
        
        public Business(String n, String o, String r, String cI, String l, String c)
        {
            name = n;
            organizationType = o;
            resources = r;
            contactInfo = cI;
            location = l;
            cost = c;
        }
        
        public String getName()
        {
            return name;
        }
        
        public String getOrganizationType()
        {
            return organizationType;
        }
        
        public String getResources()
        {
            return resources;
        }
        
        public String getContactInfo()
        {
            return contactInfo;
        }
        
        public String getLocation()
        {
            return location;
        }
        
        public String getCost()
        {
            return cost;
        }
}
