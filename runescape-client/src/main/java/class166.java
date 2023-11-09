import java.io.UnsupportedEncodingException;
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

@ObfuscatedName("gy")
public class class166 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 371416339
	)
	int field1806;
	@ObfuscatedName("aa")
	String field1807;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	UrlRequest field1802;
	@ObfuscatedName("ao")
	String field1809;
	@ObfuscatedName("ax")
	float[] field1810;
	@ObfuscatedName("ai")
	ArrayList field1811;
	@ObfuscatedName("ag")
	ArrayList field1812;
	@ObfuscatedName("ah")
	ArrayList field1813;
	@ObfuscatedName("av")
	Map field1814;
	@ObfuscatedName("ar")
	Map field1799;

	public class166() {
		this.field1806 = -1; // L: 25
		this.field1809 = null; // L: 28
		this.field1810 = new float[4]; // L: 29
		this.field1811 = new ArrayList(); // L: 30
		this.field1812 = new ArrayList(); // L: 31
		this.field1813 = new ArrayList(); // L: 32
		this.field1814 = new HashMap(); // L: 33
		this.field1799 = new HashMap(); // L: 34
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Let;I)Z",
		garbageValue = "493996582"
	)
	public boolean method3482(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 37
			if (var2 == null) { // L: 40
				return false; // L: 41
			} else {
				this.method3492(); // L: 43

				try {
					this.field1807 = var1; // L: 45
					this.field1802 = var2.request(new URL(this.field1807)); // L: 46
					this.field1806 = 0; // L: 47
					return true; // L: 48
				} catch (MalformedURLException var4) { // L: 50
					this.method3492(); // L: 51
					this.field1806 = 100; // L: 52
					return false; // L: 53
				}
			}
		} else {
			return false; // L: 38
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Let;B)V",
		garbageValue = "-18"
	)
	public void method3483(UrlRequester var1) {
		switch(this.field1806) { // L: 58
		case 0:
			this.method3543(var1);
			break; // L: 65
		case 1:
			this.method3487(); // L: 60
			break;
		default:
			return; // L: 63
		}

	} // L: 68

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-28"
	)
	public int method3484() {
		return this.field1806; // L: 71
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "92"
	)
	public int method3494(String var1) {
		return this.field1814.containsKey(var1) ? (Integer)this.field1814.get(var1) : -1; // L: 75
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "16"
	)
	public String method3486(String var1) {
		return (String)((String)(this.field1799.containsKey(var1) ? this.field1799.get(var1) : null)); // L: 79
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "434177359"
	)
	public ArrayList method3489() {
		return this.field1812; // L: 83
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "1"
	)
	public ArrayList method3542() {
		return this.field1813; // L: 87
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "79"
	)
	public String method3525() {
		return this.field1809; // L: 91
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "2102888659"
	)
	public float[] method3490() {
		return this.field1810; // L: 95
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1491892431"
	)
	public ArrayList method3491() {
		return this.field1811; // L: 99
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "865668444"
	)
	void method3492() {
		this.field1802 = null; // L: 103
		this.field1809 = null; // L: 104
		this.field1810[0] = 0.0F; // L: 105
		this.field1810[1] = 0.0F; // L: 106
		this.field1810[2] = 1.0F; // L: 107
		this.field1810[3] = 1.0F; // L: 108
		this.field1811.clear(); // L: 109
		this.field1812.clear(); // L: 110
		this.field1813.clear(); // L: 111
		this.field1814.clear(); // L: 112
		this.field1799.clear(); // L: 113
	} // L: 114

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Let;I)V",
		garbageValue = "-724612758"
	)
	void method3543(UrlRequester var1) {
		if (this.field1802 != null && this.field1802.isDone()) { // L: 117
			byte[] var2 = this.field1802.getResponse(); // L: 120
			if (var2 == null) { // L: 121
				this.method3492(); // L: 122
				this.field1806 = 100; // L: 123
			} else {
				try {
					this.method3499(new class437(var2), var1); // L: 127
				} catch (UnsupportedEncodingException var4) { // L: 129
					this.method3492(); // L: 130
					this.field1806 = 102; // L: 131
					return; // L: 132
				}

				this.field1806 = this.field1812.size() > 0 ? 1 : 2; // L: 134
				this.field1802 = null; // L: 135
			}
		}
	} // L: 118 124 136

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "155422894"
	)
	void method3487() {
		Iterator var1 = this.field1812.iterator(); // L: 139

		class172 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1812.iterator(); // L: 147

				while (var1.hasNext()) {
					var2 = (class172)var1.next(); // L: 148
					if (var2.field1849 != null) { // L: 150
						byte[] var3 = var2.field1849.getResponse(); // L: 151
						if (var3 != null && var3.length > 0) { // L: 152
							this.field1806 = 2; // L: 153
							return; // L: 154
						}
					}
				}

				this.method3492(); // L: 159
				this.field1806 = 101; // L: 160
				return; // L: 161
			}

			var2 = (class172)var1.next(); // L: 140
		} while(var2.field1849 == null || var2.field1849.isDone()); // L: 142

	} // L: 143

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Let;I)V",
		garbageValue = "2041464667"
	)
	void method3495(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 164
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 165
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 167
					class172 var5 = new class172(this); // L: 168
					var5.field1849 = var2.request(new URL(var4.getString("src"))); // L: 169
					var5.field1848 = UserComparator8.method2886(var4, "placement"); // L: 170
					this.field1812.add(var5); // L: 171
				} catch (MalformedURLException var6) { // L: 173
				}
			}

		}
	} // L: 175

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;B)V",
		garbageValue = "3"
	)
	void method3496(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 178
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 179
				JSONObject var3 = var1.getJSONObject(var2); // L: 180
				class173 var4 = new class173(this); // L: 181
				var4.field1855 = var3.getString("text"); // L: 182
				String var7 = var3.getString("align_x"); // L: 185
				byte var6;
				if (var7.equals("centre")) { // L: 187
					var6 = 1; // L: 188
				} else if (!var7.equals("bottom") && !var7.equals("right")) { // L: 191
					var6 = 0; // L: 195
				} else {
					var6 = 2; // L: 192
				}

				var4.field1858 = var6; // L: 197
				String var10 = var3.getString("align_y"); // L: 200
				byte var9;
				if (var10.equals("centre")) { // L: 202
					var9 = 1; // L: 203
				} else if (!var10.equals("bottom") && !var10.equals("right")) { // L: 206
					var9 = 0; // L: 210
				} else {
					var9 = 2; // L: 207
				}

				var4.field1859 = var9; // L: 212
				var4.field1853 = var3.getInt("font"); // L: 213
				var4.field1856 = UserComparator8.method2886(var3, "placement"); // L: 214
				this.field1813.add(var4); // L: 215
			}

		}
	} // L: 217

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-28927295"
	)
	void method3497(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 220
			this.field1810 = UserComparator8.method2886(var1, "clickbounds"); // L: 221
			this.field1809 = var1.getString("endpoint"); // L: 222
			String[] var2 = JSONObject.getNames(var1); // L: 223

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 224
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 225
					try {
						int var4 = var1.getInt(var2[var3]); // L: 227
						this.field1811.add(new class174(this, var2[var3], var4)); // L: 228
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 232
							if (var5.equals("true")) { // L: 233
								this.field1811.add(new class174(this, var2[var3], 1)); // L: 234
							} else if (var5.equals("false")) { // L: 236
								this.field1811.add(new class174(this, var2[var3], 0)); // L: 237
							} else {
								this.field1811.add(new class165(this, var2[var3], var5)); // L: 240
							}
						} catch (Exception var7) { // L: 243
						}
					}
				}
			}

		}
	} // L: 247

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "891662681"
	)
	void method3526(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 250

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 251
			try {
				int var4 = var1.getInt(var2[var3]); // L: 253
				this.field1814.put(var2[var3], var4); // L: 254
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 258
					if (var5.equals("true")) { // L: 259
						this.field1814.put(var2[var3], 1); // L: 260
					} else if (var5.equals("false")) { // L: 262
						this.field1814.put(var2[var3], 0); // L: 263
					} else {
						this.field1799.put(var2[var3], var5); // L: 266
					}
				} catch (Exception var7) { // L: 269
				}
			}
		}

	} // L: 272

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqv;Let;I)V",
		garbageValue = "1522687051"
	)
	void method3499(class437 var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.method8332(); // L: 277
			var3 = var3.getJSONObject("message"); // L: 278
		} catch (Exception var9) { // L: 280
			this.method3492(); // L: 281
			this.field1806 = 102; // L: 282
			return; // L: 283
		}

		try {
			this.method3495(var3.getJSONArray("images"), var2); // L: 286
		} catch (Exception var8) { // L: 288
			this.field1812.clear(); // L: 289
		}

		try {
			this.method3496(var3.getJSONArray("labels")); // L: 292
		} catch (Exception var7) { // L: 294
			this.field1813.clear(); // L: 295
		}

		try {
			this.method3497(var3.getJSONObject("behaviour")); // L: 298
		} catch (Exception var6) { // L: 300
			this.field1809 = null; // L: 301
			this.field1810[0] = 0.0F; // L: 302
			this.field1810[1] = 0.0F; // L: 303
			this.field1810[2] = 1.0F; // L: 304
			this.field1810[3] = 1.0F; // L: 305
			this.field1811.clear(); // L: 306
		}

		try {
			this.method3526(var3.getJSONObject("meta")); // L: 309
		} catch (Exception var5) { // L: 311
			this.field1814.clear(); // L: 312
			this.field1799.clear(); // L: 313
		}

	} // L: 315

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Let;I)Z",
		garbageValue = "-1306660801"
	)
	public boolean method3500(String var1, UrlRequester var2) {
		try {
			this.method3499(new class437(var1.getBytes()), var2); // L: 319
			this.field1806 = this.field1812.size() > 0 ? 1 : 2; // L: 320
		} catch (UnsupportedEncodingException var4) { // L: 322
			this.field1806 = 102; // L: 323
		}

		return this.field1806 < 100; // L: 325
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9480
			Widget var0 = SoundSystem.getWidgetChild(class236.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9481
			if (var0 != null && var0.onTargetLeave != null) { // L: 9482
				ScriptEvent var1 = new ScriptEvent(); // L: 9483
				var1.widget = var0; // L: 9484
				var1.args = var0.onTargetLeave; // L: 9485
				HealthBarUpdate.runScriptEvent(var1); // L: 9486
			}

			Client.selectedSpellItemId = -1; // L: 9488
			Client.isSpellSelected = false; // L: 9489
			class144.invalidateWidget(var0); // L: 9490
		}
	} // L: 9491

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Lmq;IIIIIIB)V",
		garbageValue = "-101"
	)
	static final void method3547(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field569) { // L: 10544
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10545
		}

		Client.field569 = false; // L: 10546
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10547
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10548
				var0.scrollY -= 4; // L: 10549
				class144.invalidateWidget(var0); // L: 10550
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10552
				var0.scrollY += 4; // L: 10553
				class144.invalidateWidget(var0); // L: 10554
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10556
				var7 = var3 * (var3 - 32) / var4; // L: 10557
				if (var7 < 8) { // L: 10558
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10559
				int var9 = var3 - 32 - var7; // L: 10560
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10561
				class144.invalidateWidget(var0); // L: 10562
				Client.field569 = true; // L: 10563
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10566
			var7 = var0.width; // L: 10567
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10568
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10569
				class144.invalidateWidget(var0); // L: 10570
			}
		}

	} // L: 10573
}
