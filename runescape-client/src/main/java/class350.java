import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
public class class350 {
	static {
		new HashMap();
	} // L: 9

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Llm;IB)V",
		garbageValue = "52"
	)
	static void method6771(Archive var0, int var1) {
		if (var0.field4205) { // L: 192
			if (var1 <= NetCache.field4253) { // L: 193
				throw new RuntimeException(""); // L: 194
			}

			if (var1 < NetCache.field4254) { // L: 196
				NetCache.field4254 = var1; // L: 197
			}
		} else {
			if (var1 >= NetCache.field4254) { // L: 201
				throw new RuntimeException(""); // L: 202
			}

			if (var1 > NetCache.field4253) { // L: 204
				NetCache.field4253 = var1; // L: 205
			}
		}

		if (class10.field56 != null) { // L: 208
			class1.method9(var0, var1); // L: 209
		} else {
			World.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 212
			NetCache.NetCache_archives[var1] = var0; // L: 213
		}
	} // L: 210 214
}
