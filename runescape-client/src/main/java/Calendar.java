import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("am")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("ap")
	@Export("DAYS_OF_THE_WEEK")
	static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("af")
	@Export("Calendar_calendar")
	static java.util.Calendar Calendar_calendar;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}}; // L: 8
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; // L: 18
		java.util.Calendar.getInstance(); // L: 22
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT")); // L: 23
	} // L: 24

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1839098111"
	)
	static void method6881() {
		if (Client.packetWriter != null && Client.packetWriter.isaacCipher != null) { // L: 4597
			PacketBufferNode var0 = class482.getPacketBufferNode(ClientPacket.field3185, Client.packetWriter.isaacCipher); // L: 4599
			var0.packetBuffer.writeByte(ClanChannelMember.getWindowedMode()); // L: 4600
			var0.packetBuffer.writeShort(class524.canvasWidth); // L: 4601
			var0.packetBuffer.writeShort(GameEngine.canvasHeight); // L: 4602
			Client.packetWriter.addNode(var0); // L: 4603
		}
	} // L: 4604
}
