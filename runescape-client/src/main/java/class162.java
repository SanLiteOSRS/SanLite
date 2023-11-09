import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ft")
public class class162 {
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "[Lri;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 575930881
	)
	int field1769;
	@ObfuscatedName("r")
	String field1777;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	UrlRequest field1771;
	@ObfuscatedName("s")
	String field1773;
	@ObfuscatedName("p")
	float[] field1776;
	@ObfuscatedName("b")
	ArrayList field1774;
	@ObfuscatedName("o")
	ArrayList field1775;
	@ObfuscatedName("u")
	ArrayList field1770;
	@ObfuscatedName("z")
	Map field1772;
	@ObfuscatedName("t")
	Map field1766;

	public class162() {
		this.field1769 = -1; // L: 24
		this.field1773 = null; // L: 27
		this.field1776 = new float[4]; // L: 28
		this.field1774 = new ArrayList(); // L: 29
		this.field1775 = new ArrayList(); // L: 30
		this.field1770 = new ArrayList(); // L: 31
		this.field1772 = new HashMap(); // L: 32
		this.field1766 = new HashMap(); // L: 33
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ldk;I)Z",
		garbageValue = "1735189222"
	)
	public boolean method3271(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 36
			if (var2 == null) { // L: 39
				return false; // L: 40
			} else {
				this.method3307(); // L: 42

				try {
					this.field1777 = var1; // L: 44
					this.field1771 = var2.request(new URL(this.field1777)); // L: 45
					this.field1769 = 0; // L: 46
					return true; // L: 47
				} catch (MalformedURLException var4) { // L: 49
					this.method3307(); // L: 50
					this.field1769 = 100; // L: 51
					return false; // L: 52
				}
			}
		} else {
			return false; // L: 37
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1731463892"
	)
	public void method3272(UrlRequester var1) {
		switch(this.field1769) { // L: 57
		case 0:
			this.method3270(var1); // L: 61
			break;
		case 1:
			this.method3281();
			break; // L: 64
		default:
			return; // L: 59
		}

	} // L: 67

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method3310() {
		return this.field1769; // L: 70
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-16"
	)
	public int method3274(String var1) {
		return this.field1772.containsKey(var1) ? (Integer)this.field1772.get(var1) : -1; // L: 74
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "42"
	)
	public String method3275(String var1) {
		return (String)((String)(this.field1766.containsKey(var1) ? this.field1766.get(var1) : null)); // L: 78
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-153446942"
	)
	public ArrayList method3276() {
		return this.field1775; // L: 82
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "104"
	)
	public ArrayList method3325() {
		return this.field1770; // L: 86
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1744575005"
	)
	public String method3278() {
		return this.field1773; // L: 90
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1957600459"
	)
	public ArrayList method3279() {
		return this.field1774; // L: 94
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2001144966"
	)
	void method3307() {
		this.field1771 = null; // L: 98
		this.field1773 = null; // L: 99
		this.field1776[0] = 0.0F; // L: 100
		this.field1776[1] = 0.0F; // L: 101
		this.field1776[2] = 1.0F; // L: 102
		this.field1776[3] = 1.0F; // L: 103
		this.field1774.clear(); // L: 104
		this.field1775.clear(); // L: 105
		this.field1770.clear(); // L: 106
		this.field1772.clear(); // L: 107
		this.field1766.clear(); // L: 108
	} // L: 109

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ldk;I)V",
		garbageValue = "-1850950888"
	)
	void method3270(UrlRequester var1) {
		if (this.field1771 != null && this.field1771.isDone()) { // L: 112
			byte[] var2 = this.field1771.getResponse(); // L: 115
			if (var2 == null) { // L: 116
				this.method3307(); // L: 117
				this.field1769 = 100; // L: 118
			} else {
				JSONObject var3;
				try {
					class419 var4 = new class419(var2); // L: 123
					var3 = var4.method7786(); // L: 124
					var3 = var3.getJSONObject("message"); // L: 125
				} catch (Exception var9) { // L: 127
					this.method3307(); // L: 128
					this.field1769 = 102; // L: 129
					return; // L: 130
				}

				try {
					this.method3282(var3.getJSONArray("images"), var1); // L: 133
				} catch (Exception var8) { // L: 135
					this.field1775.clear(); // L: 136
				}

				try {
					this.method3294(var3.getJSONArray("labels")); // L: 139
				} catch (Exception var7) { // L: 141
					this.field1770.clear(); // L: 142
				}

				try {
					this.method3273(var3.getJSONObject("behaviour")); // L: 145
				} catch (Exception var6) { // L: 147
					this.field1773 = null; // L: 148
					this.field1776[0] = 0.0F; // L: 149
					this.field1776[1] = 0.0F; // L: 150
					this.field1776[2] = 1.0F; // L: 151
					this.field1776[3] = 1.0F; // L: 152
					this.field1774.clear(); // L: 153
				}

				try {
					this.method3280(var3.getJSONObject("meta")); // L: 156
				} catch (Exception var5) { // L: 158
					this.field1772.clear(); // L: 159
					this.field1766.clear(); // L: 160
				}

				this.field1769 = this.field1775.size() > 0 ? 1 : 2; // L: 162
				this.field1771 = null; // L: 163
			}
		}
	} // L: 113 119 164

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2061464376"
	)
	void method3281() {
		Iterator var1 = this.field1775.iterator(); // L: 167

		class167 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1775.iterator(); // L: 175

				while (var1.hasNext()) {
					var2 = (class167)var1.next(); // L: 176
					if (var2.field1815 != null) { // L: 178
						byte[] var3 = var2.field1815.getResponse(); // L: 179
						if (var3 != null && var3.length > 0) { // L: 180
							this.field1769 = 2; // L: 181
							return; // L: 182
						}
					}
				}

				this.method3307(); // L: 187
				this.field1769 = 101; // L: 188
				return; // L: 189
			}

			var2 = (class167)var1.next(); // L: 168
		} while(var2.field1815 == null || var2.field1815.isDone()); // L: 170

	} // L: 171

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Ldk;B)V",
		garbageValue = "-89"
	)
	void method3282(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 192
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 193
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 195
					class167 var5 = new class167(this); // L: 196
					var5.field1815 = var2.request(new URL(var4.getString("src"))); // L: 197
					var5.field1814 = class127.method2919(var4, "placement"); // L: 198
					this.field1775.add(var5); // L: 199
				} catch (MalformedURLException var6) { // L: 201
				}
			}

		}
	} // L: 203

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-889720204"
	)
	void method3294(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 206
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 207
				JSONObject var3 = var1.getJSONObject(var2); // L: 208
				class168 var4 = new class168(this); // L: 209
				var4.field1818 = var3.getString("text"); // L: 210
				String var7 = var3.getString("align_x"); // L: 213
				byte var6;
				if (var7.equals("centre")) { // L: 215
					var6 = 1; // L: 216
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 219
					var6 = 0; // L: 223
				} else {
					var6 = 2; // L: 220
				}

				var4.field1820 = var6; // L: 225
				String var10 = var3.getString("align_y"); // L: 228
				byte var9;
				if (var10.equals("centre")) { // L: 230
					var9 = 1; // L: 231
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 234
					var9 = 0; // L: 238
				} else {
					var9 = 2; // L: 235
				}

				var4.field1821 = var9; // L: 240
				var4.field1822 = var3.getInt("font"); // L: 241
				var4.field1816 = class127.method2919(var3, "placement"); // L: 242
				this.field1770.add(var4); // L: 243
			}

		}
	} // L: 245

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "2"
	)
	void method3273(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 248
			this.field1776 = class127.method2919(var1, "clickbounds"); // L: 249
			this.field1773 = var1.getString("endpoint"); // L: 250
			String[] var2 = JSONObject.getNames(var1); // L: 251

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 252
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 253
					try {
						int var4 = var1.getInt(var2[var3]); // L: 255
						this.field1774.add(new class169(this, var2[var3], var4)); // L: 256
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 260
							if (var5.equals("true")) { // L: 261
								this.field1774.add(new class169(this, var2[var3], 1)); // L: 262
							} else if (var5.equals("false")) { // L: 264
								this.field1774.add(new class169(this, var2[var3], 0)); // L: 265
							} else {
								this.field1774.add(new class161(this, var2[var3], var5)); // L: 268
							}
						} catch (Exception var7) { // L: 271
						}
					}
				}
			}

		}
	} // L: 275

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1027086610"
	)
	void method3280(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 278

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 279
			try {
				int var4 = var1.getInt(var2[var3]); // L: 281
				this.field1772.put(var2[var3], var4); // L: 282
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 286
					if (var5.equals("true")) { // L: 287
						this.field1772.put(var2[var3], 1); // L: 288
					} else if (var5.equals("false")) { // L: 290
						this.field1772.put(var2[var3], 0); // L: 291
					} else {
						this.field1766.put(var2[var3], var5); // L: 294
					}
				} catch (Exception var7) { // L: 297
				}
			}
		}

	} // L: 300

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-381583551"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[ApproximateRouteStrategy.Client_plane][var0][var1]; // L: 8292
		if (var2 == null) { // L: 8293
			class139.scene.removeGroundItemPile(ApproximateRouteStrategy.Client_plane, var0, var1); // L: 8294
		} else {
			long var3 = -99999999L; // L: 8297
			TileItem var5 = null; // L: 8298

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8299 8300 8308
				ItemComposition var7 = MidiPcmStream.ItemComposition_get(var6.id); // L: 8301
				long var11 = (long)var7.price; // L: 8302
				if (var7.isStackable == 1) { // L: 8303
					var11 *= (long)(var6.quantity + 1);
				}

				if (var11 > var3) { // L: 8304
					var3 = var11; // L: 8305
					var5 = var6; // L: 8306
				}
			}

			if (var5 == null) { // L: 8310
				class139.scene.removeGroundItemPile(ApproximateRouteStrategy.Client_plane, var0, var1); // L: 8311
			} else {
				var2.addLast(var5); // L: 8314
				TileItem var13 = null; // L: 8315
				TileItem var8 = null; // L: 8316

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8317 8318 8323
					if (var5.id != var6.id) { // L: 8319
						if (var13 == null) { // L: 8320
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) { // L: 8321
							var8 = var6;
						}
					}
				}

				long var9 = SpotAnimationDefinition.calculateTag(var0, var1, 3, false, 0); // L: 8325
				class139.scene.newGroundItemPile(ApproximateRouteStrategy.Client_plane, var0, var1, class132.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, ApproximateRouteStrategy.Client_plane), var5, var9, var13, var8); // L: 8326
			}
		}
	} // L: 8295 8312 8327

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "529958261"
	)
	static final String method3326(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*"; // L: 10992 10993
	}
}
