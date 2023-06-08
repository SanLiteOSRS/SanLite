import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class155 extends class158 {
	@ObfuscatedName("st")
	static boolean field1722;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -968793973
	)
	int field1718;
	@ObfuscatedName("an")
	byte field1723;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1624354661
	)
	int field1720;
	@ObfuscatedName("as")
	String field1721;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	final class159 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgh;)V"
	)
	class155(class159 var1) {
		this.this$0 = var1;
		this.field1718 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-986564571"
	)
	void vmethod3370(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1718 = var1.readUnsignedShort(); // L: 134
		this.field1723 = var1.readByte(); // L: 135
		this.field1720 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1721 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "1284013379"
	)
	void vmethod3371(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1718); // L: 143
		var2.rank = this.field1723; // L: 144
		var2.world = this.field1720; // L: 145
		var2.username = new Username(this.field1721); // L: 146
	} // L: 147

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-768750236"
	)
	public static int method3288(int var0) {
		return class302.field3370[var0]; // L: 26
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "486411013"
	)
	public static void method3287() {
		if (MouseHandler.MouseHandler_instance != null) { // L: 50
			synchronized(MouseHandler.MouseHandler_instance) { // L: 51
				MouseHandler.MouseHandler_instance = null; // L: 52
			} // L: 53
		}

	} // L: 55
}
