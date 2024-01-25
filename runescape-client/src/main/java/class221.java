import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ix")
public class class221 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	static final class221 field2373;
	@ObfuscatedName("ap")
	Map field2371;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1865511625
	)
	int field2372;

	static {
		field2373 = new class221(); // L: 14
	}

	class221() {
		this.field2371 = new HashMap(); // L: 12
		this.field2372 = 0;
	} // L: 16

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILeg;B)V",
		garbageValue = "117"
	)
	void method4351(JSONObject var1, int var2, UrlRequester var3) {
		this.field2371.clear(); // L: 23

		JSONObject var4;
		try {
			var4 = var1; // L: 26
			this.field2372 = var2; // L: 27
			var1.getLong("lastfullsyncat"); // L: 28
			var1.getLong("lastcardupdatedat"); // L: 29
		} catch (Exception var7) { // L: 31
			return; // L: 32
		}

		try {
			this.method4357(var4.getJSONArray("crmcomponents"), this.field2372, var3); // L: 35
		} catch (Exception var6) { // L: 37
		}
	} // L: 38 40

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILeg;B)V",
		garbageValue = "57"
	)
	void method4357(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) { // L: 43
			for (int var4 = 0; var4 < var1.length(); ++var4) { // L: 44
				JSONObject var5 = var1.getJSONObject(var4); // L: 45
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) { // L: 46 49
					String var6 = var5.getString("platform"); // L: 52
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) { // L: 53
						class219 var7 = new class219(); // L: 56

						try {
							var7.method4319(var5, var2, var3); // L: 58
						} catch (Exception var9) { // L: 60
						}

						if (!var7.field2356.isEmpty()) { // L: 61
							String var8 = var5.getString("location"); // L: 62
							this.field2371.put(var8, var7); // L: 63
						}
					}
				}
			}

			this.field2371 = this.method4353(); // L: 66
			UserComparator9.method2973(); // L: 67
		}
	} // L: 68

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/Map;",
		garbageValue = "-15024"
	)
	Map method4353() {
		HashMap var1 = new HashMap(); // L: 71
		ArrayList var2 = new ArrayList(); // L: 72
		var2.addAll(this.field2371.entrySet()); // L: 73
		boolean var3 = false; // L: 74

		while (!var3) { // L: 76
			var3 = true; // L: 77

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) { // L: 78
				if (((class219)((Entry)var2.get(var7)).getValue()).method4317() > ((class219)((Entry)var2.get(var7 + 1)).getValue()).method4317()) { // L: 79
					Entry var4 = (Entry)var2.get(var7); // L: 80
					var2.set(var7, var2.get(var7 + 1)); // L: 81
					var2.set(var7 + 1, var4); // L: 82
					var3 = false; // L: 83
				}
			}
		}

		Iterator var5 = var2.iterator(); // L: 87

		while (var5.hasNext()) {
			Entry var6 = (Entry)var5.next(); // L: 88
			var1.put(var6.getKey(), var6.getValue()); // L: 90
		}

		return var1; // L: 93
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lih;",
		garbageValue = "713553195"
	)
	class219 method4354(String var1) {
		return (class219)this.field2371.get(var1); // L: 97
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "44"
	)
	static final int method4355(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16; // L: 13
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Low;II)V",
		garbageValue = "-641761940"
	)
	public static void method4364(AbstractArchive var0, int var1) {
		if (!class319.field3466.isEmpty()) { // L: 156
			ArrayList var2 = new ArrayList(); // L: 159
			Iterator var3 = class319.field3466.iterator(); // L: 160

			while (var3.hasNext()) {
				class331 var4 = (class331)var3.next(); // L: 161
				var4.field3579 = false; // L: 163
				var4.field3575 = false; // L: 164
				var4.field3580 = false; // L: 165
				var4.field3581 = false; // L: 166
				var4.field3572 = var0; // L: 167
				var4.field3577 = var1; // L: 168
				var4.field3576 = 0.0F; // L: 169
				var2.add(var4); // L: 170
			}

			LoginScreenAnimation.method2528(var2, class319.field3460, class319.field3464, class319.field3465, class319.field3454, false); // L: 173
		}
	} // L: 157 174
}
