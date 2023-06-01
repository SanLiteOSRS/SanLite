import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rp")
public class class451 implements class449 {
	@ObfuscatedName("ay")
	final Map field4734;

	public class451(Map var1) {
		this.field4734 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "-1761651048"
	)
	public class448 vmethod8317() {
		return null; // L: 16
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "47349056"
	)
	public byte[] vmethod8318() throws UnsupportedEncodingException {
		return this.method8320().getBytes("UTF-8"); // L: 21
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1483808636"
	)
	public String method8320() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 25
		Iterator var2 = this.field4734.entrySet().iterator(); // L: 26

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 27
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8"); // L: 29
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8"); // L: 30
			var1.append(var4).append("=").append(var5).append("&"); // L: 31
		}

		if (var1.length() == 0) { // L: 34
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1); // L: 35
			var1.insert(0, "?"); // L: 36
			return var1.toString(); // L: 37
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Lhg;IIIB)V",
		garbageValue = "-8"
	)
	static void method8327(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && WorldMapManager.clientPreferences.method2444() != 0) { // L: 3700
			if (var0.field2274 != null && var0.field2274.containsKey(var1)) { // L: 3701
				int var4 = (Integer)var0.field2274.get(var1); // L: 3702
				if (var4 != 0) { // L: 3706
					int var7 = var4 >> 8; // L: 3707
					int var8 = var4 >> 4 & 7; // L: 3708
					int var9 = var4 & 15; // L: 3709
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3710
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3711
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3712
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3713
					int var10 = (var2 - 64) / 128; // L: 3714
					int var11 = (var3 - 64) / 128; // L: 3715
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3716
					++Client.soundEffectCount; // L: 3717
				}

			}
		}
	} // L: 3719
}
