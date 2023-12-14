/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Ayush
 */
public class BrokerDirectory {
        private ArrayList<Broker> brokerDirectory;
        private static final String[] brokerNames = {
    "Andrew Miller", "Isabel Martinez", "Charlie Harris", "Grace Robinson", "Daniel Thomas",
    "Ava Davis", "Ethan Lewis", "Chloe Anderson", "Matthew Carter", "Sophie Turner"
        };
        
    public BrokerDirectory() {
        this.brokerDirectory = new ArrayList<Broker>();
        
        for (int i = 0; i < 10; i++) {
            Broker broker = new Broker();
             UUID randomId = UUID.randomUUID();
            String brokerID = "Broker-" + randomId.toString();
            String[] names = brokerNames[i].split(" ");
            broker.setBrokerID(brokerID);
            broker.setBrokerName(brokerNames[i]);
            broker.setBrokerUserName(names[0].toLowerCase());
            String password = names[0].toLowerCase();
            broker.setBrokerPassword(Hashing.encrypt(password, "secretKey"));
            broker.setBrokerPhoneNumber("123456789" + (i + 1));
            broker.setBrokerEmailID("broker-" + (names[0]) + "@gmail.com");
            brokerDirectory.add(broker);
        }
    }

    public ArrayList<Broker> getBrokerDirectory() {
        return brokerDirectory;
    }

    public void setBrokerDirectory(ArrayList<Broker> brokerDirectory) {
        this.brokerDirectory = brokerDirectory;
    }

    public Broker addBroker() {
       Broker broker = new Broker();
       brokerDirectory.add(broker);
       return broker;
   }
    
    public Broker brokerAuthentication(String username, String password) {
        for(Broker broker : brokerDirectory) {
            if(broker.getBrokerUserName().equals(username) && broker.getBrokerPassword().equals(password)) {
                return broker;
            }
        }
        return null;
    }
    
}
