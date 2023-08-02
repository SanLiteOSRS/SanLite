import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class162 extends class143 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 94323223
	)
	int field1770;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class162(class146 var1) {
		this.this$0 = var1;
		this.field1770 = -1; // L: 144
	} // L: 146

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1770 = var1.readUnsignedShort(); // L: 149
	} // L: 150

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3232(this.field1770); // L: 153
	} // L: 154

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "1"
	)
	static ArrayList method3356() {
		ArrayList var0 = new ArrayList(); // L: 199
		Iterator var1 = class306.field3394.iterator(); // L: 200

		while (var1.hasNext()) {
			class318 var2 = (class318)var1.next(); // L: 201
			var0.add(var2); // L: 203
		}

		return var0; // L: 206
	}
}
