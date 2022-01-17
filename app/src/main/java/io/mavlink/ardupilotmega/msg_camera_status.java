/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CAMERA_STATUS PACKING
package io.mavlink.ardupilotmega;
import io.mavlink.MAVLinkPacket;
import io.mavlink.Messages.MAVLinkMessage;
import io.mavlink.Messages.MAVLinkPayload;
        
/**
 * Camera Event.
 */
public class msg_camera_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_CAMERA_STATUS = 179;
    public static final int MAVLINK_MSG_LENGTH = 29;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CAMERA_STATUS;

      
    /**
     * Image timestamp (since UNIX epoch, according to camera clock).
     */
    public long time_usec;
      
    /**
     * Parameter 1 (meaning depends on event_id, see CAMERA_STATUS_TYPES enum).
     */
    public float p1;
      
    /**
     * Parameter 2 (meaning depends on event_id, see CAMERA_STATUS_TYPES enum).
     */
    public float p2;
      
    /**
     * Parameter 3 (meaning depends on event_id, see CAMERA_STATUS_TYPES enum).
     */
    public float p3;
      
    /**
     * Parameter 4 (meaning depends on event_id, see CAMERA_STATUS_TYPES enum).
     */
    public float p4;
      
    /**
     * Image index.
     */
    public int img_idx;
      
    /**
     * System ID.
     */
    public short target_system;
      
    /**
     * Camera ID.
     */
    public short cam_idx;
      
    /**
     * Event type.
     */
    public short event_id;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_CAMERA_STATUS;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putFloat(p1);
        packet.payload.putFloat(p2);
        packet.payload.putFloat(p3);
        packet.payload.putFloat(p4);
        packet.payload.putUnsignedShort(img_idx);
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(cam_idx);
        packet.payload.putUnsignedByte(event_id);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a camera_status message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.p1 = payload.getFloat();
        this.p2 = payload.getFloat();
        this.p3 = payload.getFloat();
        this.p4 = payload.getFloat();
        this.img_idx = payload.getUnsignedShort();
        this.target_system = payload.getUnsignedByte();
        this.cam_idx = payload.getUnsignedByte();
        this.event_id = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_camera_status() {
        this.msgid = MAVLINK_MSG_ID_CAMERA_STATUS;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_camera_status( long time_usec, float p1, float p2, float p3, float p4, int img_idx, short target_system, short cam_idx, short event_id) {
        this.msgid = MAVLINK_MSG_ID_CAMERA_STATUS;

        this.time_usec = time_usec;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.img_idx = img_idx;
        this.target_system = target_system;
        this.cam_idx = cam_idx;
        this.event_id = event_id;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_camera_status( long time_usec, float p1, float p2, float p3, float p4, int img_idx, short target_system, short cam_idx, short event_id, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_CAMERA_STATUS;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.img_idx = img_idx;
        this.target_system = target_system;
        this.cam_idx = cam_idx;
        this.event_id = event_id;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_camera_status(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_CAMERA_STATUS;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                      
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_CAMERA_STATUS - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" p1:"+p1+" p2:"+p2+" p3:"+p3+" p4:"+p4+" img_idx:"+img_idx+" target_system:"+target_system+" cam_idx:"+cam_idx+" event_id:"+event_id+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_CAMERA_STATUS";
    }
}
        