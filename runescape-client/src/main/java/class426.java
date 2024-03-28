import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public abstract class class426 {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	class426 field4649;
	@ObfuscatedName("at")
	String field4653;
	@ObfuscatedName("an")
	String field4651;
	@ObfuscatedName("ao")
	boolean field4650;
	@ObfuscatedName("ab")
	boolean field4654;

	@ObfuscatedSignature(
		descriptor = "(Lqc;)V"
	)
	class426(class426 var1) {
		this.field4649 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public abstract boolean vmethod7854();

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "21996"
	)
	public boolean method7826() {
		return this.field4650; // L: 17
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1961667359"
	)
	public boolean method7829() {
		return this.field4654; // L: 21
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "495814194"
	)
	public String method7842() {
		return "Error in task: " + this.field4651 + ", Error message: " + this.field4653; // L: 25
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lqc;",
		garbageValue = "-5"
	)
	public class426 method7827() {
		return this.field4649; // L: 29
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "53"
	)
	void method7844(String var1) {
		this.field4650 = true; // L: 33
		this.field4653 = var1; // L: 34
	} // L: 35

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2033769251"
	)
	static void method7848(boolean var0) {
		class333 var2;
		if (var0) { // L: 201
			Iterator var7 = class321.field3495.iterator(); // L: 203

			while (true) {
				do {
					if (!var7.hasNext()) {
						class321.field3495.clear(); // L: 225
						return; // L: 250
					}

					var2 = (class333)var7.next(); // L: 204
				} while(var2 == null); // L: 206

				var2.field3613.clear(); // L: 209
				var2.field3613.method6004(); // L: 210
				var2.field3613.setPcmStreamVolume(0); // L: 211
				var2.field3613.field3534 = 0; // L: 212
				int var3 = var2.field3605; // L: 213
				int var4 = var2.field3606; // L: 214
				Iterator var5 = class321.field3499.iterator(); // L: 216

				while (var5.hasNext()) {
					class327 var6 = (class327)var5.next(); // L: 217
					var6.vmethod6187(var3, var4); // L: 219
				}
			}
		} else {
			for (int var1 = 0; var1 < class321.field3495.size(); ++var1) { // L: 229
				var2 = (class333)class321.field3495.get(var1); // L: 230
				if (var2 == null) { // L: 231
					class321.field3495.remove(var1); // L: 232
					--var1; // L: 233
				} else if (var2.field3612) { // L: 235
					if (var2.field3613.field3534 > 0) { // L: 236
						--var2.field3613.field3534; // L: 237
					}

					var2.field3613.clear(); // L: 239
					var2.field3613.method6004(); // L: 240
					var2.field3613.setPcmStreamVolume(0); // L: 241
					class321.field3495.remove(var1); // L: 242
					--var1; // L: 243
				} else {
					var2.field3612 = true; // L: 246
				}
			}

		}
	}
}
