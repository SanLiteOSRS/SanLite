import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class156 extends class160 {
	@ObfuscatedName("jk")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Luq;"
	)
	static SpritePixels[] field1746;
	@ObfuscatedName("ai")
	String field1743;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1029481787
	)
	int field1747;
	@ObfuscatedName("ac")
	byte field1745;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class156(class161 var1) {
		this.this$0 = var1;
		this.field1743 = null; // L: 55
	} // L: 59

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;I)V",
		garbageValue = "-1847441946"
	)
	void vmethod3451(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1743 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1747 = var1.readUnsignedShort(); // L: 67
		this.field1745 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lgb;I)V",
		garbageValue = "-1976910783"
	)
	void vmethod3453(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1743); // L: 74
		var2.world = this.field1747; // L: 75
		var2.rank = this.field1745; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldw;III)V",
		garbageValue = "669838425"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 108
		Script var4;
		if (class131.isWorldMapEvent(var0.type)) { // L: 110
			Interpreter.worldMapEvent = (WorldMapEvent)var3[0]; // L: 111
			WorldMapElement var6 = class127.WorldMapElement_get(Interpreter.worldMapEvent.mapElement); // L: 112
			var4 = class138.getWorldMapScript(var0.type, var6.objectId, var6.category); // L: 113
		} else {
			int var5 = (Integer)var3[0]; // L: 116
			var4 = class465.getScript(var5); // L: 117
		}

		if (var4 != null) { // L: 119
			FriendsList.method7850(var0, var4, var1, var2); // L: 120
		}

	} // L: 122

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1408896576"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1911
		Login.Login_response2 = var1; // L: 1912
		Login.Login_response3 = var2; // L: 1913
	} // L: 1914

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method3359() {
		if (Timer.pcmPlayer1 != null) { // L: 3709
			Timer.pcmPlayer1.run();
		}

	} // L: 3710
}
