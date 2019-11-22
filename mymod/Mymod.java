package net.tpsdn.mymod;
 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.projectfloodlight.openflow.protocol.OFFlowAdd;
import org.projectfloodlight.openflow.protocol.OFPortDesc;
import org.projectfloodlight.openflow.protocol.action.OFAction;
//import org.projectfloodlight.openflow.protocol.action.OFActionOutput;
import org.projectfloodlight.openflow.protocol.match.Match;
//import org.projectfloodlight.openflow.protocol.match.MatchField;
import org.projectfloodlight.openflow.types.DatapathId;
import org.projectfloodlight.openflow.types.EthType;
import org.projectfloodlight.openflow.types.IpProtocol;
import org.projectfloodlight.openflow.types.OFBufferId;
import org.projectfloodlight.openflow.types.OFPort;

import net.floodlightcontroller.core.module.FloodlightModuleContext;
import net.floodlightcontroller.core.module.FloodlightModuleException;
import net.floodlightcontroller.core.module.IFloodlightModule;
import net.floodlightcontroller.core.module.IFloodlightService;
import net.floodlightcontroller.staticentry.IStaticEntryPusherService;
 
public class Mymod implements IFloodlightModule, ImymodService {

	protected IStaticEntryPusherService sfp;
 
    @Override
    public Collection<Class<? extends IFloodlightService>> getModuleServices() {
        // TODO Auto-generated method stub
        return null;
    }
 
    @Override
    public Map<Class<? extends IFloodlightService>, IFloodlightService> getServiceImpls() {
        // TODO Auto-generated method stub
        return null;
    }
 
    @Override
    public Collection<Class<? extends IFloodlightService>> getModuleDependencies() {
        


        return null;
    }
 
    @Override
    public void init(FloodlightModuleContext context) throws FloodlightModuleException {
        // TODO Auto-generated method stub
 
    }
 
    @Override
    public void startUp(FloodlightModuleContext context) throws FloodlightModuleException {
        // TODO Auto-generated method stub
    	//But de cette logique est de filtrer les paquets de type POST, 
    	//lire le numéro qui s'y trouve et créer un flow vers le serveur correspondant
    	
    	//ETAPE 1:
    	
    	//ETAPE 2:
    	
    	//ETAPE 3: création du flow, inspiré de l'exemple en classe DHCPSwitchHlowSetter
    	//Pour cela, on a besoin de récupérer le port du switch qui va vers le serveur désiré
    	ArrayList<OFAction> actionList = new ArrayList<OFAction>();
    	sfp.addFlow("dhcp-port---" + port.getPortNo().getPortNumber() + "---(" + port.getName() + ")", flow.build(), sw.getId());
    }
}
