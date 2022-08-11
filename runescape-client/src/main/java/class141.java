import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ea")
public class class141 extends class144 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1612165561
	)
	int field1642;
	@ObfuscatedName("q")
	byte field1643;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1820695807
	)
	int field1645;
	@ObfuscatedName("u")
	String field1644;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class141(class145 var1) {
		this.this$0 = var1;
		this.field1642 = -1; // L: 125
	} // L: 130

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-1897546377"
	)
	void vmethod3146(Buffer var1) {
		var1.readUnsignedByte(); // L: 133
		this.field1642 = var1.readUnsignedShort(); // L: 134
		this.field1643 = var1.readByte(); // L: 135
		this.field1645 = var1.readUnsignedShort(); // L: 136
		var1.readLong(); // L: 137
		this.field1644 = var1.readStringCp1252NullTerminated(); // L: 138
		var1.readUnsignedByte(); // L: 139
	} // L: 140

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "-406744366"
	)
	void vmethod3145(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1642); // L: 143
		var2.rank = this.field1643; // L: 144
		var2.world = this.field1645; // L: 145
		var2.username = new Username(this.field1644); // L: 146
	} // L: 147

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "1"
	)
	public static int method3060(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 30
			int var6 = var3; // L: 31
			var3 = var4; // L: 32
			var4 = var6; // L: 33
		}

		var2 &= 3; // L: 35
		if (var2 == 0) { // L: 36
			return var1;
		} else if (var2 == 1) { // L: 37
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0; // L: 38
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "342406360"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 218
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 219
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 220
			return Short.TYPE;
		} else if (var0.equals("J")) { // L: 221
			return Long.TYPE;
		} else if (var0.equals("Z")) { // L: 222
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 223
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 224
			return Double.TYPE;
		} else if (var0.equals("C")) { // L: 225
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 226 227
		}
	}

	@ObfuscatedName("a")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 93
	}
}
