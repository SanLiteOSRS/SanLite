import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class167 extends class145 {
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = -575111985
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -3903049656232214041L
	)
	long field1814;
	@ObfuscatedName("aw")
	String field1819;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class167(class148 var1) {
		this.this$0 = var1;
		this.field1814 = -1L; // L: 194
		this.field1819 = null; // L: 195
	} // L: 197

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1814 = var1.readLong(); // L: 202
		}

		this.field1819 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3334(this.field1814, this.field1819); // L: 208
	} // L: 209

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)Ldf;",
		garbageValue = "1422"
	)
	static ClientPreferences method3498() {
		AccessFile var0 = null; // L: 117
		ClientPreferences var1 = new ClientPreferences(); // L: 118

		try {
			var0 = VarcInt.getPreferencesFile("", KeyHandler.field151.name, false); // L: 120
			byte[] var2 = new byte[(int)var0.length()]; // L: 121

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) { // L: 122 123 126
				var4 = var0.read(var2, var3, var2.length - var3); // L: 124
				if (var4 == -1) {
					throw new IOException(); // L: 125
				}
			}

			var1 = new ClientPreferences(new Buffer(var2)); // L: 128
		} catch (Exception var6) { // L: 130
		}

		try {
			if (var0 != null) { // L: 132
				var0.close(); // L: 133
			}
		} catch (Exception var5) { // L: 136
		}

		return var1; // L: 137
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "441714061"
	)
	public static int method3503(int var0) {
		return (var0 & class527.field5152) - 1; // L: 26
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "([Lng;Lng;ZS)V",
		garbageValue = "-26660"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 11164
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 11165
		class343.resizeInterface(var0, var1.id, var3, var4, var2); // L: 11166
		if (var1.children != null) {
			class343.resizeInterface(var1.children, var1.id, var3, var4, var2); // L: 11167
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 11168
		if (var5 != null) { // L: 11169
			VarpDefinition.method3551(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) { // L: 11170
		}

	} // L: 11171
}
