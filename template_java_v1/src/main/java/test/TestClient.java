/* EQUINIX MESSAGING GATEWAY TEST CLIENT

# ************************************************************************
#
#  EQUINIX CONFIDENTIAL
# __________________
#
#   © 2020 Equinix, Inc. All rights reserved.
#
#  Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
# THE SOFTWARE.
#
# Terms of Use: https://www.equinix.com/company/legal/terms/
#
# *************************************************************************/

package test;

import org.json.JSONObject;
import template.EquinixShipmentTemplate;
import template.EquinixWorkVisitTemplate;

public class TestClient {

	public static final String CLIENT_ID = "<CLIENT_ID>";
	public static final String CLIENT_SECRET = "<CLIENT_SECRET>";
	public static final String ORDER_NUMBER = "<ORDER_NUMBER>";

	public static final String NOTIFICATION_OPEN = "Open";
	public static final String NOTIFICATION_INPROGRESS = "InProgress";
	public static final String NOTIFICATION_CLOSED = "Closed";
	public static final String NOTIFICATION_CANCELLED = "Cancelled";
	public static final String NOTIFICATION_PENDING_CUSTOMER_INPUT = "Pending Customer Input";

	public static final JSONObject CREATE_WORKVISIT_PAYLOAD = new JSONObject("{\"CustomerContact\": \"<CUSTOMER_CONTACT>\",\n" +
			"\"RequestorId\": \"<REQUESTOR ID>\",\n" +
			"\"RequestorIdUnique\": false,\n" +
			"\"Location\": \"<LOCATION>\",\n" +
			"\"Attachments\": [],\n" +
			"\"Description\": \"Test description for WorkVisit Create\",\n" +
			"\"ServiceDetails\": {\n" +
			"\"StartDateTime\": \"2020-12-01T00:00:00.000Z\",\n" +
			"\"EndDateTime\": \"2020-12-02T00:00:00.000Z\",\n" +
			"\"OpenCabinet\": true,\n" +
			"\"Visitors\": [\n" +
			"{\n" +
			"\"FirstName\": \"Test FirstName\",\n" +
			"\"LastName\": \"Test LastName\",\n" +
			"\"CompanyName\": \"Test Company\"\n" +
			"}\n" +
			"]\n" +
			"}}");

	public static final JSONObject UPDATE_WORKVISIT_PAYLOAD = new JSONObject("{\"ServicerId\": \""+ORDER_NUMBER+"\",\n" +
			"\"Attachments\": [],\n" +
			"\"Description\": \"Test description for WorkVisit Update\",\n" +
			"\"ServiceDetails\": {\n" +
			"\"StartDateTime\": \"2020-12-03T00:00:00.000Z\",\n" +
			"\"EndDateTime\": \"2020-12-04T00:00:00Z\",\n" +
			"\"OpenCabinet\": true,\n" +
			"\"Visitors\": [\n" +
			"{\n" +
			"\"FirstName\": \"Test FirstName\",\n" +
			"\"LastName\": \"Test LastName\",\n" +
			"\"CompanyName\": \"Test Company\"\n" +
			"}\n" +
			"]\n" +
			"}}");

	public static final JSONObject CANCEL_WORKVISIT_PAYLOAD = new JSONObject("{\"ServicerId\": \""+ORDER_NUMBER+"\",\n" +
			"\"Description\": \"Test description for WorkVisit Cancel\",\n" +
			"\"State\": \"Cancelled\",\n" +
			"}");

	public static final JSONObject CREATE_INBOUNDSHIPMENT_CARRIERTYPE_PAYLOAD = new JSONObject("{\n" +
			"    \"RequestorId\": \"<REQUESTOR ID>\",\n" +
			"    \"RequestorIdUnique\": false,\n" +
			"    \"CustomerContact\": \"<CUSTOMER_CONTACT>\",\n" +
			"    \"Operation\": \"0000/0000\",\n" +
			"    \"Location\": \"<LOCATION>\",\n" +
			"    \"Description\": \"Test description for Inbound Shipment Create\",\n" +
			"    \"Attachments\": [],\n" +
			"    \"CarrierName\": \"TEST\",\n" +
			"    \"ShipmentDateTime\": \"2020-12-01T00:00:00.000Z\",\n" +
			"    \"ShipmentIdentifier\": \"TRACK123456\",\n" +
			"    \"ServiceDetails\": {\n" +
			"    \"NoOfBoxes\": 99,\n" +
			"    \"DeliverToCage\": false\n" +
			"    }\n" +
			"}");

	public static final JSONObject CREATE_INBOUNDSHIPMENT_CUSTOMERCARRYTYPE_PAYLOAD = new JSONObject("{\n" +
			"    \"RequestorId\": \"<REQUESTOR ID>\",\n" +
			"    \"RequestorIdUnique\": false,\n" +
			"    \"CustomerContact\": \"<CUSTOMER_CONTACT>\",\n" +
			"    \"Operation\": \"0000/0001\",\n" +
			"    \"Location\": \"<LOCATION>\",\n" +
			"    \"Description\": \"Test description for Inbound Shipment Create\",\n" +
			"    \"Attachments\": [],\n" +
			"    \"CarrierName\": \"TEST\",\n" +
			"    \"ShipmentDateTime\": \"2020-12-01T00:00:00.000Z\",\n" +
			"    \"ServiceDetails\": {\n" +
			"    \"NoOfBoxes\": 99,\n" +
			"    \"DeliverToCage\": false\n" +
			"    }\n" +
			"}");

	public static final JSONObject CREATE_OUTBOUNDSHIPMENT_CARRIERTYPE_PAYLOAD = new JSONObject("{\n" +
			"    \"RequestorId\": \"<REQUESTOR ID>\",\n" +
			"    \"RequestorIdUnique\": false,\n" +
			"    \"Operation\": \"0001/0000\",\n" +
			"    \"Location\": \"<LOCATION>\",\n" +
			"    \"CustomerContact\": \"<CUSTOMER_CONTACT>\",\n" +
			"    \"Description\": \"Test description for Outbound Shipment Create\",\n" +
			"    \"Attachments\": [],\n" +
			"    \"CarrierName\": \"TEST\",\n" +
			"    \"ShipmentIdentifier\": \"12345dse456546456\",\n" +
			"    \"ShipmentDateTime\": \"2020-12-01T00:00:00.000Z\",\n" +
			"    \"ShipmentLabel\": [],\n" +
			"    \"ShipmentLabelInsideBox\": false,\n" +
			"    \"ServiceDetails\": {\n" +
			"          \"NoOfBoxes\": 3,\n" +
			"          \"DeclaredValue\": \"3\",\n" +
			"          \"ShipmentDescription\": \"Test ShipmentDescription\",\n" +
			"          \"ShipToName\": \"test\",\n" +
			"          \"ShipToAddress\": \"1188 test address\",\n" +
			"          \"ShipToCity\": \"Sunnyvale\",\n" +
			"          \"ShipToCountry\": \"US\",\n" +
			"          \"ShipToState\": \"CALIFORNIA\",\n" +
			"          \"ShipToZipCode\": \"94085\",\n" +
			"          \"ShipToPhoneNumber\": \"+1 1331313\",\n" +
			"          \"ShipToCarrierAccountNumber\": \"111\",\n" +
			"          \"InsureShipment\": false,\n" +
			"          \"PickUpFromCageSuite\": false,\n" +
			"        }\n" +
			"}\n");

	public static final JSONObject CREATE_OUTBOUNDSHIPMENT_CUSTOMERCARRYTYPE_PAYLOAD = new JSONObject("{\n" +
			"    \"RequestorId\": \"<REQUESTOR ID>\",\n" +
			"    \"RequestorIdUnique\": false,\n" +
			"    \"Operation\": \"0001/0001\",\n" +
			"    \"Location\": \"<LOCATION>\",\n" +
			"    \"CustomerContact\": \"<CUSTOMER_CONTACT>\",\n" +
			"    \"Description\": \"Test description for Outbound Shipment Create\",\n" +
			"    \"Attachments\": [],\n" +
			"    \"ShipmentDateTime\": \"2020-12-01T00:00:00.000Z\",\n" +
			"    \"ShipmentLabelInsideBox\": false\n" +
			"}");

	public static final JSONObject UPDATE_INBOUNDSHIPMENT_PAYLOAD = new JSONObject("{\n" +
			"    \"RequestorId\": \"<REQUESTOR ID>\",\n" +
			"    \"ServicerId\": "+ORDER_NUMBER+",\n" +
			"    \"Description\": \"Test description for Inbound Shipment Update\",\n" +
			"    \"Attachments\": [],\n" +
			"    \"CarrierName\": \"OTHER\",\n" +
			"    \"ServiceDetails\": {\n" +
			"    \"NoOfBoxes\": 999,\n" +
			"    \"DeliverToCage\": true\n" +
			"    }\n" +
			"}");

	public static final JSONObject UPDATE_OUTBOUNDSHIPMENT_PAYLOAD = new JSONObject("{\n" +
			"    \"RequestorId\": \"<REQUESTOR ID>\",\n" +
			"    \"ServicerId\": "+ORDER_NUMBER+",\n" +
			"    \"Attachments\": [],\n" +
			"    \"Description\": \"Test description for Outbound Shipment Update\",\n" +
			"    \"ShipmentIdentifier\": \"12345dse456546456\",\n" +
			"    \"ShipmentDateTime\": \"2020-12-02T00:00:00.000Z\",\n" +
			"    \"CarrierName\": \"OTHER\",\n" +
			"    \"ShipmentLabelInsideBox\": true,\n" +
			"    \"ServiceDetails\": {\n" +
			"      \"NoOfBoxes\": 3,\n" +
			"      \"DeclaredValue\": \"3\",\n" +
			"      \"ShipmentDescription\": \"Test ShipmentDescription\",\n" +
			"      \"ShipToName\": \"test\",\n" +
			"      \"ShipToAddress\": \"1188 test address\",\n" +
			"      \"ShipToCity\": \"Sunnyvale\",\n" +
			"      \"ShipToCountry\": \"US\",\n" +
			"      \"ShipToState\": \"CALIFORNIA\",\n" +
			"      \"ShipToZipCode\": \"94085\",\n" +
			"      \"ShipToPhoneNumber\": \"+1 1331313\",\n" +
			"      \"ShipToCarrierAccountNumber\": \"111\",\n" +
			"      \"InsureShipment\": false,\n" +
			"      \"PickUpFromCageSuite\": false,\n" +
			"    }\n" +
			"}\n");

	public static final JSONObject CANCEL_SHIPMENT_PAYLOAD = new JSONObject("{\n" +
			"    \"Description\": \"Test description for Shipment Cancel\",\n" +
			"    \"RequestorId\": \"<REQUESTOR ID>\",\n" +
			"    \"ServicerId\": "+ORDER_NUMBER+",\n" +
			"    \"State\": \"Cancelled\"\n" +
			"}");

	public static void test_create_work_visit() throws Exception {
		System.out.println("\n\nSending Create WorkVisit Request Message  **********\n\n");
		EquinixWorkVisitTemplate template = new EquinixWorkVisitTemplate();
		JSONObject result = template.createWorkVisit(TestClient.CREATE_WORKVISIT_PAYLOAD,CLIENT_ID,CLIENT_SECRET);
		System.out.println("\n\nReceiving Create WorkVisit Response Message  **********\n\n"+result);
	}

	public static void test_update_work_visit() throws Exception {
		System.out.println("\n\nSending Update WorkVisit Request Message  **********\n\n");
		EquinixWorkVisitTemplate template = new EquinixWorkVisitTemplate();
		JSONObject result = template.updateWorkVisit(TestClient.UPDATE_WORKVISIT_PAYLOAD,CLIENT_ID,CLIENT_SECRET);
		System.out.println("\n\nReceiving Update WorkVisit Response Message  **********\n\n"+result);
	}

	public static void test_cancel_work_visit() throws Exception {
		System.out.println("\n\nSending Cancel WorkVisit Request Message  **********\n\n");
		EquinixWorkVisitTemplate template = new EquinixWorkVisitTemplate();
		JSONObject result = template.cancelWorkVisit(TestClient.CANCEL_WORKVISIT_PAYLOAD,CLIENT_ID,CLIENT_SECRET);
		System.out.println("\n\nReceiving Cancel WorkVisit Response Message  **********\n\n"+result);
	}

	public static void test_workvisit_notifications() throws Exception {
		System.out.println("\n\nSending WorkVisit Notification Request Message  **********\n\n");
		//(customerReferenceNumber, orderNumber, activityID, state - Open, InProgress, Cancelled, Closed)
		EquinixWorkVisitTemplate template = new EquinixWorkVisitTemplate();
		JSONObject result = template.getNotifications(null, ORDER_NUMBER, null, NOTIFICATION_OPEN);
		System.out.println("\n\nReceiving WorkVisit Notification Response Message  **********\n\n"+result);
	}

	public static void test_create_inbound_shipment_carriertype() throws Exception {
		System.out.println("\n\nSending Create Inbound Shipment Request Message  **********\n\n");
		EquinixShipmentTemplate template = new EquinixShipmentTemplate();
		JSONObject result = template.createShipment(TestClient.CREATE_INBOUNDSHIPMENT_CARRIERTYPE_PAYLOAD,CLIENT_ID,CLIENT_SECRET);
		System.out.println("\n\nReceiving Create Inbound Shipment Response Message  **********\n\n"+result);
	}

	public static void test_create_inbound_shipment_customercarrytype() throws Exception {
		System.out.println("\n\nSending Create Inbound Shipment Request Message  **********\n\n");
		EquinixShipmentTemplate template = new EquinixShipmentTemplate();
		JSONObject result = template.createShipment(TestClient.CREATE_INBOUNDSHIPMENT_CUSTOMERCARRYTYPE_PAYLOAD,CLIENT_ID,CLIENT_SECRET);
		System.out.println("\n\nReceiving Create Inbound Shipment Response Message  **********\n\n"+result);
	}

	public static void test_create_outbound_shipment_carriertype() throws Exception {
		System.out.println("\n\nSending Create Outbound Shipment Request Message  **********\n\n");
		EquinixShipmentTemplate template = new EquinixShipmentTemplate();
		JSONObject result = template.createShipment(TestClient.CREATE_OUTBOUNDSHIPMENT_CARRIERTYPE_PAYLOAD,CLIENT_ID,CLIENT_SECRET);
		System.out.println("\n\nReceiving Create Outbound Shipment Response Message  **********\n\n"+result);
	}

	public static void test_create_outbound_shipment_customercarrytype() throws Exception {
		System.out.println("\n\nSending Create Outbound Shipment Request Message  **********\n\n");
		EquinixShipmentTemplate template = new EquinixShipmentTemplate();
		JSONObject result = template.createShipment(TestClient.CREATE_OUTBOUNDSHIPMENT_CUSTOMERCARRYTYPE_PAYLOAD,CLIENT_ID,CLIENT_SECRET);
		System.out.println("\n\nReceiving Create Outbound Shipment Response Message  **********\n\n"+result);
	}

	public static void test_update_inbound_shipment() throws Exception {
		System.out.println("\n\nSending Update Inbound Shipment Request Message  **********\n\n");
		EquinixShipmentTemplate template = new EquinixShipmentTemplate();
		JSONObject result = template.updateShipment(TestClient.UPDATE_INBOUNDSHIPMENT_PAYLOAD,CLIENT_ID,CLIENT_SECRET);
		System.out.println("\n\nReceiving Update Inbound Shipment Response Message  **********\n\n"+result);
	}

	public static void test_update_outbound_shipment() throws Exception {
		System.out.println("\n\nSending Update Outbound Shipment Request Message  **********\n\n");
		EquinixShipmentTemplate template = new EquinixShipmentTemplate();
		JSONObject result = template.updateShipment(TestClient.UPDATE_OUTBOUNDSHIPMENT_PAYLOAD,CLIENT_ID,CLIENT_SECRET);
		System.out.println("\n\nReceiving Update Outbound Shipment Response Message  **********\n\n"+result);
	}

	public static void test_cancel_shipment() throws Exception {
		System.out.println("\n\nSending Cancel Shipment Request Message  **********\n\n");
		EquinixShipmentTemplate template = new EquinixShipmentTemplate();
		JSONObject result = template.cancelShipment(TestClient.CANCEL_SHIPMENT_PAYLOAD,CLIENT_ID,CLIENT_SECRET);
		System.out.println("\n\nReceiving Cancel Shipment Response Message  **********\n\n"+result);
	}

	public static void test_shipment_notifications() throws Exception {
		System.out.println("\n\nSending Shipment Notification Request Message  **********\n\n");
		//(customerReferenceNumber, orderNumber, activityID, state - Open, InProgress, Cancelled, Closed)
		EquinixShipmentTemplate template = new EquinixShipmentTemplate();
		JSONObject result = template.getNotifications(null,ORDER_NUMBER, null, null);
		System.out.println("\n\nReceiving Shipment Notification Response Message  **********\n\n"+result);
	}

	public static void main(String args[]) throws Exception {
		test_create_work_visit();
	//	test_update_work_visit();
	//	test_cancel_work_visit();
	//	test_workvisit_notifications();
	//	test_create_inbound_shipment_carriertype();
	//	test_create_inbound_shipment_customercarrytype();
	//	test_update_inbound_shipment();
	//	test_create_outbound_shipment_carriertype();
	//	test_create_outbound_shipment_customercarrytype();
	//	test_update_outbound_shipment();
	//	test_cancel_shipment();
	//	test_shipment_notifications();
	}
}

