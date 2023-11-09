import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fs")
public class class166 {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1251567839
	)
	int field1819;
	@ObfuscatedName("k")
	String field1820;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	UrlRequest field1826;
	@ObfuscatedName("r")
	String field1827;
	@ObfuscatedName("b")
	float[] field1828;
	@ObfuscatedName("m")
	ArrayList field1829;
	@ObfuscatedName("t")
	ArrayList field1830;
	@ObfuscatedName("h")
	ArrayList field1831;
	@ObfuscatedName("p")
	Map field1824;
	@ObfuscatedName("o")
	Map field1833;

	public class166() {
		this.field1819 = -1; // L: 24
		this.field1827 = null; // L: 27
		this.field1828 = new float[4]; // L: 28
		this.field1829 = new ArrayList(); // L: 29
		this.field1830 = new ArrayList(); // L: 30
		this.field1831 = new ArrayList(); // L: 31
		this.field1824 = new HashMap(); // L: 32
		this.field1833 = new HashMap(); // L: 33
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ldi;I)Z",
		garbageValue = "-1906969818"
	)
	public boolean method3418(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 36
			if (var2 == null) { // L: 39
				return false; // L: 40
			} else {
				this.method3426(); // L: 42

				try {
					this.field1820 = var1; // L: 44
					this.field1826 = var2.request(new URL(this.field1820)); // L: 45
					this.field1819 = 0; // L: 46
					return true; // L: 47
				} catch (MalformedURLException var4) { // L: 49
					this.method3426(); // L: 50
					this.field1819 = 100; // L: 51
					return false; // L: 52
				}
			}
		} else {
			return false; // L: 37
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "-441833752"
	)
	public void method3419(UrlRequester var1) {
		switch(this.field1819) { // L: 57
		case 0:
			this.method3427(var1); // L: 62
			break; // L: 63
		case 1:
			this.method3428(); // L: 59
			break;
		default:
			return; // L: 65
		}

	} // L: 67

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1468199543"
	)
	public int method3420() {
		return this.field1819; // L: 70
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "342662863"
	)
	public int method3433(String var1) {
		return this.field1824.containsKey(var1) ? (Integer)this.field1824.get(var1) : -1; // L: 74
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-183486423"
	)
	public String method3422(String var1) {
		return (String)((String)(this.field1833.containsKey(var1) ? this.field1833.get(var1) : null)); // L: 78
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-745265160"
	)
	public ArrayList method3459() {
		return this.field1830; // L: 82
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1813839199"
	)
	public ArrayList method3424() {
		return this.field1831; // L: 86
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "532962276"
	)
	public String method3425() {
		return this.field1827; // L: 90
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "61"
	)
	public ArrayList method3448() {
		return this.field1829; // L: 94
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "435595886"
	)
	void method3426() {
		this.field1826 = null; // L: 98
		this.field1827 = null; // L: 99
		this.field1828[0] = 0.0F; // L: 100
		this.field1828[1] = 0.0F; // L: 101
		this.field1828[2] = 1.0F; // L: 102
		this.field1828[3] = 1.0F; // L: 103
		this.field1829.clear(); // L: 104
		this.field1830.clear(); // L: 105
		this.field1831.clear(); // L: 106
		this.field1824.clear(); // L: 107
		this.field1833.clear(); // L: 108
	} // L: 109

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;I)V",
		garbageValue = "1102983702"
	)
	void method3427(UrlRequester var1) {
		if (this.field1826 != null && this.field1826.isDone()) { // L: 112
			byte[] var2 = this.field1826.getResponse(); // L: 115
			if (var2 == null) { // L: 116
				this.method3426(); // L: 117
				this.field1819 = 100; // L: 118
			} else {
				JSONObject var3;
				try {
					class429 var4 = new class429(var2); // L: 123
					var3 = var4.method8045(); // L: 124
					var3 = var3.getJSONObject("message"); // L: 125
				} catch (Exception var9) { // L: 127
					this.method3426(); // L: 128
					this.field1819 = 102; // L: 129
					return; // L: 130
				}

				try {
					this.method3429(var3.getJSONArray("images"), var1); // L: 133
				} catch (Exception var8) { // L: 135
					this.field1830.clear(); // L: 136
				}

				try {
					this.method3430(var3.getJSONArray("labels")); // L: 139
				} catch (Exception var7) { // L: 141
					this.field1831.clear(); // L: 142
				}

				try {
					this.method3463(var3.getJSONObject("behaviour")); // L: 145
				} catch (Exception var6) { // L: 147
					this.field1827 = null; // L: 148
					this.field1828[0] = 0.0F; // L: 149
					this.field1828[1] = 0.0F; // L: 150
					this.field1828[2] = 1.0F; // L: 151
					this.field1828[3] = 1.0F; // L: 152
					this.field1829.clear(); // L: 153
				}

				try {
					this.method3467(var3.getJSONObject("meta")); // L: 156
				} catch (Exception var5) { // L: 158
					this.field1824.clear(); // L: 159
					this.field1833.clear(); // L: 160
				}

				this.field1819 = this.field1830.size() > 0 ? 1 : 2; // L: 162
				this.field1826 = null; // L: 163
			}
		}
	} // L: 113 119 164

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1531480410"
	)
	void method3428() {
		Iterator var1 = this.field1830.iterator(); // L: 167

		class172 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1830.iterator(); // L: 175

				while (var1.hasNext()) {
					var2 = (class172)var1.next(); // L: 176
					if (var2.field1870 != null) { // L: 178
						byte[] var3 = var2.field1870.getResponse(); // L: 179
						if (var3 != null && var3.length > 0) { // L: 180
							this.field1819 = 2; // L: 181
							return; // L: 182
						}
					}
				}

				this.method3426(); // L: 187
				this.field1819 = 101; // L: 188
				return; // L: 189
			}

			var2 = (class172)var1.next(); // L: 168
		} while(var2.field1870 == null || var2.field1870.isDone()); // L: 170

	} // L: 171

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Ldi;I)V",
		garbageValue = "-1028826421"
	)
	void method3429(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 192
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 193
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 195
					class172 var5 = new class172(this); // L: 196
					var5.field1870 = var2.request(new URL(var4.getString("src"))); // L: 197
					var5.field1864 = class88.method2408(var4, "placement"); // L: 198
					this.field1830.add(var5); // L: 199
				} catch (MalformedURLException var6) { // L: 201
				}
			}

		}
	} // L: 203

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "1741895465"
	)
	void method3430(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 206
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 207
				JSONObject var3 = var1.getJSONObject(var2); // L: 208
				class173 var4 = new class173(this); // L: 209
				var4.field1875 = var3.getString("text"); // L: 210
				String var7 = var3.getString("align_x"); // L: 213
				byte var6;
				if (var7.equals("centre")) { // L: 215
					var6 = 1; // L: 216
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 219
					var6 = 0; // L: 223
				} else {
					var6 = 2; // L: 220
				}

				var4.field1876 = var6; // L: 225
				String var10 = var3.getString("align_y"); // L: 228
				byte var9;
				if (var10.equals("centre")) { // L: 230
					var9 = 1; // L: 231
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 234
					var9 = 0; // L: 238
				} else {
					var9 = 2; // L: 235
				}

				var4.field1878 = var9; // L: 240
				var4.field1879 = var3.getInt("font"); // L: 241
				var4.field1880 = class88.method2408(var3, "placement"); // L: 242
				this.field1831.add(var4); // L: 243
			}

		}
	} // L: 245

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-2097797182"
	)
	void method3463(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 248
			this.field1828 = class88.method2408(var1, "clickbounds"); // L: 249
			this.field1827 = var1.getString("endpoint"); // L: 250
			String[] var2 = JSONObject.getNames(var1); // L: 251

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 252
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 253
					try {
						int var4 = var1.getInt(var2[var3]); // L: 255
						this.field1829.add(new class174(this, var2[var3], var4)); // L: 256
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 260
							if (var5.equals("true")) { // L: 261
								this.field1829.add(new class174(this, var2[var3], 1)); // L: 262
							} else if (var5.equals("false")) { // L: 264
								this.field1829.add(new class174(this, var2[var3], 0)); // L: 265
							} else {
								this.field1829.add(new class165(this, var2[var3], var5)); // L: 268
							}
						} catch (Exception var7) { // L: 271
						}
					}
				}
			}

		}
	} // L: 275

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1293504682"
	)
	void method3467(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 278

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 279
			try {
				int var4 = var1.getInt(var2[var3]); // L: 281
				this.field1824.put(var2[var3], var4); // L: 282
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 286
					if (var5.equals("true")) { // L: 287
						this.field1824.put(var2[var3], 1); // L: 288
					} else if (var5.equals("false")) { // L: 290
						this.field1824.put(var2[var3], 0); // L: 291
					} else {
						this.field1833.put(var2[var3], var5); // L: 294
					}
				} catch (Exception var7) { // L: 297
				}
			}
		}

	} // L: 300
}
