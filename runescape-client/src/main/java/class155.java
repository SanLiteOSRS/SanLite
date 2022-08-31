import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("eu")
public class class155 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1709164427
	)
	int field1704;
	@ObfuscatedName("n")
	String field1705;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	UrlRequest field1706;
	@ObfuscatedName("a")
	String field1707;
	@ObfuscatedName("m")
	float[] field1702;
	@ObfuscatedName("u")
	ArrayList field1714;
	@ObfuscatedName("l")
	ArrayList field1710;
	@ObfuscatedName("z")
	ArrayList field1711;
	@ObfuscatedName("r")
	Map field1712;
	@ObfuscatedName("y")
	Map field1715;

	public class155() {
		this.field1704 = -1;
		this.field1707 = null;
		this.field1702 = new float[4];
		this.field1714 = new ArrayList();
		this.field1710 = new ArrayList();
		this.field1711 = new ArrayList(); // L: 31
		this.field1712 = new HashMap();
		this.field1715 = new HashMap();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lcu;I)Z",
		garbageValue = "1489180465"
	)
	public boolean method3163(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 == null) { // L: 39
				return false;
			} else {
				this.method3116();

				try {
					this.field1705 = var1; // L: 44
					this.field1706 = var2.request(new URL(this.field1705));
					this.field1704 = 0; // L: 46
					return true;
				} catch (MalformedURLException var4) {
					this.method3116();
					this.field1704 = 100;
					return false; // L: 52
				}
			}
		} else {
			return false; // L: 37
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lcu;I)V",
		garbageValue = "631956877"
	)
	public void method3138(UrlRequester var1) {
		switch(this.field1704) { // L: 57
		case 0:
			this.method3117(var1);
			break; // L: 64
		case 1:
			this.method3118(); // L: 61
			break;
		default:
			return; // L: 59
		}

	} // L: 67

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1528603017"
	)
	public int method3108() {
		return this.field1704; // L: 70
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1795659751"
	)
	public int method3109(String var1) {
		return this.field1712.containsKey(var1) ? (Integer)this.field1712.get(var1) : -1; // L: 74
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "20"
	)
	public String method3110(String var1) {
		return (String)((String)(this.field1715.containsKey(var1) ? this.field1715.get(var1) : null)); // L: 78
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "2023907808"
	)
	public ArrayList method3142() {
		return this.field1710; // L: 82
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-114"
	)
	public ArrayList method3112() {
		return this.field1711; // L: 86
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2023105652"
	)
	public String method3113() {
		return this.field1707; // L: 90
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-75"
	)
	public float[] method3114() {
		return this.field1702; // L: 94
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "585836824"
	)
	public ArrayList method3115() {
		return this.field1714; // L: 98
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "168847589"
	)
	void method3116() {
		this.field1706 = null; // L: 102
		this.field1707 = null; // L: 103
		this.field1702[0] = 0.0F; // L: 104
		this.field1702[1] = 0.0F; // L: 105
		this.field1702[2] = 1.0F; // L: 106
		this.field1702[3] = 1.0F; // L: 107
		this.field1714.clear(); // L: 108
		this.field1710.clear(); // L: 109
		this.field1711.clear(); // L: 110
		this.field1712.clear(); // L: 111
		this.field1715.clear(); // L: 112
	} // L: 113

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lcu;B)V",
		garbageValue = "-3"
	)
	void method3117(UrlRequester var1) {
		if (this.field1706 != null && this.field1706.isDone()) { // L: 116
			byte[] var2 = this.field1706.getResponse(); // L: 119
			if (var2 == null) { // L: 120
				this.method3116(); // L: 121
				this.field1704 = 100; // L: 122
			} else {
				JSONObject var3;
				try {
					class400 var4 = new class400(var2); // L: 127
					var3 = var4.method7049(); // L: 128
					var3 = var3.getJSONObject("message"); // L: 129
				} catch (Exception var9) { // L: 131
					this.method3116(); // L: 132
					this.field1704 = 102; // L: 133
					return; // L: 134
				}

				try {
					this.method3119(var3.getJSONArray("images"), var1); // L: 137
				} catch (Exception var8) { // L: 139
					this.field1710.clear(); // L: 140
				}

				try {
					this.method3111(var3.getJSONArray("labels")); // L: 143
				} catch (Exception var7) { // L: 145
					this.field1711.clear(); // L: 146
				}

				try {
					this.method3121(var3.getJSONObject("behaviour")); // L: 149
				} catch (Exception var6) { // L: 151
					this.field1707 = null; // L: 152
					this.field1702[0] = 0.0F; // L: 153
					this.field1702[1] = 0.0F; // L: 154
					this.field1702[2] = 1.0F; // L: 155
					this.field1702[3] = 1.0F; // L: 156
					this.field1714.clear(); // L: 157
				}

				try {
					this.method3122(var3.getJSONObject("meta")); // L: 160
				} catch (Exception var5) { // L: 162
					this.field1712.clear(); // L: 163
					this.field1715.clear(); // L: 164
				}

				this.field1704 = this.field1710.size() > 0 ? 1 : 2; // L: 166
				this.field1706 = null; // L: 167
			}
		}
	} // L: 117 123 168

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1943134133"
	)
	void method3118() {
		Iterator var1 = this.field1710.iterator(); // L: 171

		class160 var2;
		do {
			if (!var1.hasNext()) { // L: 178
				var1 = this.field1710.iterator(); // L: 179

				while (var1.hasNext()) {
					var2 = (class160)var1.next(); // L: 180
					if (var2.field1749 != null) { // L: 182
						byte[] var3 = var2.field1749.getResponse(); // L: 183
						if (var3 != null && var3.length > 0) { // L: 184
							this.field1704 = 2; // L: 185
							return; // L: 186
						}
					}
				}

				this.method3116(); // L: 191
				this.field1704 = 101; // L: 192
				return; // L: 193
			}

			var2 = (class160)var1.next(); // L: 172
		} while(var2.field1749 == null || var2.field1749.isDone()); // L: 174

	} // L: 175

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lcu;B)V",
		garbageValue = "1"
	)
	void method3119(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 196
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 197
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 199
					class160 var5 = new class160(this); // L: 200
					var5.field1749 = var2.request(new URL(var4.getString("src"))); // L: 201
					var5.field1748 = class149.method3061(var4, "placement"); // L: 202
					this.field1710.add(var5); // L: 203
				} catch (MalformedURLException var6) { // L: 205
				}
			}

		}
	} // L: 207

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "2030988407"
	)
	void method3111(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 210
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 211
				JSONObject var3 = var1.getJSONObject(var2); // L: 212
				class161 var4 = new class161(this); // L: 213
				var4.field1755 = var3.getString("text"); // L: 214
				var4.field1758 = Renderable.method4228(var3.getString("align_x")); // L: 215
				var4.field1757 = Renderable.method4228(var3.getString("align_y")); // L: 216
				var4.field1759 = var3.getInt("font"); // L: 217
				var4.field1752 = class149.method3061(var3, "placement"); // L: 218
				this.field1711.add(var4); // L: 219
			}

		}
	} // L: 221

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "110"
	)
	void method3121(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 224
			this.field1702 = class149.method3061(var1, "clickbounds"); // L: 225
			this.field1707 = var1.getString("endpoint"); // L: 226
			String[] var2 = JSONObject.getNames(var1); // L: 227

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 228
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 229
					try {
						int var4 = var1.getInt(var2[var3]); // L: 231
						this.field1714.add(new class162(this, var2[var3], var4)); // L: 232
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 236
							if (var5.equals("true")) { // L: 237
								this.field1714.add(new class162(this, var2[var3], 1)); // L: 238
							} else if (var5.equals("false")) { // L: 240
								this.field1714.add(new class162(this, var2[var3], 0)); // L: 241
							} else {
								this.field1714.add(new class154(this, var2[var3], var5)); // L: 244
							}
						} catch (Exception var7) { // L: 247
						}
					}
				}
			}

		}
	} // L: 251

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-2113668680"
	)
	void method3122(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 254

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 255
			try {
				int var4 = var1.getInt(var2[var3]); // L: 257
				this.field1712.put(var2[var3], var4); // L: 258
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 262
					if (var5.equals("true")) { // L: 263
						this.field1712.put(var2[var3], 1); // L: 264
					} else if (var5.equals("false")) { // L: 266
						this.field1712.put(var2[var3], 0); // L: 267
					} else {
						this.field1715.put(var2[var3], var5); // L: 270
					}
				} catch (Exception var7) { // L: 273
				}
			}
		}

	} // L: 276

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BI)Lqn;",
		garbageValue = "-928428496"
	)
	public static final SpritePixels method3172(byte[] var0) {
		BufferedImage var1 = null; // L: 20

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var6 * var7]; // L: 27
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "2112007443"
	)
	public static String method3173(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 21
		int var4 = 0; // L: 22
		int var5 = var1; // L: 23

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) { // L: 24 25 56
			int var7 = var0[var5++] & 255; // L: 26
			if (var7 < 128) { // L: 28
				if (var7 == 0) { // L: 29
					var8 = 65533;
				} else {
					var8 = var7; // L: 30
				}
			} else if (var7 < 192) { // L: 32
				var8 = 65533;
			} else if (var7 < 224) { // L: 33
				if (var5 < var6 && (var0[var5] & 192) == 128) { // L: 34
					var8 = (var7 & 31) << 6 | var0[var5++] & 63; // L: 35
					if (var8 < 128) { // L: 36
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 38
				}
			} else if (var7 < 240) { // L: 40
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) { // L: 41
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 42
					if (var8 < 2048) { // L: 43
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 45
				}
			} else if (var7 < 248) { // L: 47
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) { // L: 48
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63; // L: 49
					if (var8 >= 65536 && var8 <= 1114111) { // L: 50
						var8 = 65533; // L: 51
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533; // L: 53
				}
			} else {
				var8 = 65533; // L: 55
			}
		}

		return new String(var3, 0, var4); // L: 58
	}
}
