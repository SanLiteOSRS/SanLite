import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
class class497 implements Iterator {
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 62282521
	)
	int field5017;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	final class498 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ltp;)V"
	)
	class497(class498 var1) {
		this.this$0 = var1; // L: 51
	}

	public boolean hasNext() {
		return this.field5017 < this.this$0.method8357(); // L: 56
	}

	public Object next() {
		int var1 = ++this.field5017 - 1; // L: 61
		class457 var2 = (class457)this.this$0.field5018.get((long)var1); // L: 62
		return var2 != null ? var2 : this.this$0.method8885(var1); // L: 63 64
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 69
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "2111297623"
	)
	public static String method8882(CharSequence var0) {
		int var1 = var0.length(); // L: 11
		StringBuilder var2 = new StringBuilder(var1); // L: 12

		for (int var3 = 0; var3 < var1; ++var3) { // L: 13
			char var4 = var0.charAt(var3); // L: 14
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') { // L: 15
				if (var4 == ' ') { // L: 16
					var2.append('+');
				} else {
					byte var5 = class313.charToByteCp1252(var4); // L: 18
					var2.append('%'); // L: 19
					int var6 = var5 >> 4 & 15; // L: 20
					if (var6 >= 10) { // L: 21
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 22
					}

					var6 = var5 & 15; // L: 23
					if (var6 >= 10) { // L: 24
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48)); // L: 25
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString(); // L: 28
	}
}
