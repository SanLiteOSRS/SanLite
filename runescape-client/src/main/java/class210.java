import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("il")
public class class210 {
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	class219 field2296;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	class221 field2300;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1935079169
	)
	int field2301;
	@ObfuscatedName("aj")
	String field2302;
	@ObfuscatedName("af")
	String field2303;
	@ObfuscatedName("ax")
	String field2304;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	UrlRequest field2307;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 39900149
	)
	int field2305;

	public class210() {
		this.field2301 = -1; // L: 28
		this.field2305 = 0; // L: 33
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lim;",
		garbageValue = "-502019476"
	)
	public class219 method4161() {
		return this.field2296; // L: 36
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lel;I)Z",
		garbageValue = "-118439298"
	)
	public boolean method4174(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			if (var3 == null) { // L: 43
				return false; // L: 44
			} else {
				this.method4142(); // L: 46

				try {
					this.field2302 = var1; // L: 48
					this.field2307 = var3.request(new URL(this.field2302)); // L: 49
					this.field2301 = 0; // L: 50
				} catch (MalformedURLException var5) { // L: 52
					this.method4142(); // L: 53
					this.field2301 = 4; // L: 54
					return false; // L: 55
				}

				if (!var2.isEmpty()) { // L: 57
					this.field2304 = var2; // L: 58
				}

				return true; // L: 60
			}
		} else {
			return false; // L: 41
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "101"
	)
	public void method4129(String var1, String var2, String var3) {
		this.field2296 = VarbitComposition.method3830(); // L: 64
		this.field2303 = var1; // L: 65
		this.field2296.method4264(this.field2303, var2, var3); // L: 66
	} // L: 67

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "-809833952"
	)
	public void method4132(UrlRequester var1) {
		switch(this.field2301) { // L: 70
		case 0:
			this.method4138(var1); // L: 72
			break;
		case 1:
			this.method4144();
			break; // L: 77
		default:
			return; // L: 75
		}

	} // L: 80

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2049217182"
	)
	public int method4162() {
		return this.field2301; // L: 83
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-121"
	)
	public int method4134(String var1) {
		return this.field2300.field2389.containsKey(var1) ? (Integer)this.field2300.field2389.get(var1) : -1; // L: 87
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1954864910"
	)
	public String method4135(String var1) {
		return (String)((String)(this.field2300.field2388.containsKey(var1) ? this.field2300.field2388.get(var1) : null)); // L: 91
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-447746548"
	)
	public ArrayList method4136() {
		return this.field2300.field2385; // L: 95
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "111"
	)
	public ArrayList method4146() {
		return this.field2300.field2386; // L: 99
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-6"
	)
	public ArrayList method4163() {
		return this.field2300.field2384; // L: 103
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "126321540"
	)
	public String method4139() {
		return this.field2300.field2387; // L: 107
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "34"
	)
	public float[] method4140() {
		return this.field2300.field2382; // L: 111
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "112414850"
	)
	public String method4141() {
		return this.field2300.method4315(); // L: 115
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2064016499"
	)
	void method4142() {
		this.field2307 = null; // L: 119
	} // L: 120

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lel;B)V",
		garbageValue = "16"
	)
	void method4138(UrlRequester var1) {
		if (this.field2307 != null && this.field2307.isDone()) { // L: 123
			byte[] var2 = this.field2307.getResponse(); // L: 126
			if (var2 == null) { // L: 127
				this.method4142(); // L: 128
				this.field2301 = 4; // L: 129
			} else {
				try {
					class481 var3 = new class481(var2); // L: 133
					JSONObject var4 = var3.method8769(); // L: 134
					if (var4 == null) { // L: 135
						return;
					}

					try {
						this.field2305 = var4.getInt("version"); // L: 137
					} catch (Exception var7) { // L: 139
						this.method4142(); // L: 140
						this.field2301 = 6; // L: 141
						return; // L: 142
					}

					if (this.field2305 < 2) { // L: 144
						if (!this.field2300.method4304(var4, this.field2305, var1)) { // L: 145
							this.field2301 = 6; // L: 146
						}
					} else if (this.field2305 == 2) { // L: 149
						class223 var5 = class223.field2401; // L: 152
						var5.method4353(var4, this.field2305, var1); // L: 155
						this.field2300 = var5.method4348(this.field2304); // L: 156
						if (this.field2300 != null) { // L: 157
							this.method4144(); // L: 158
							this.field2301 = 1; // L: 159
						} else {
							this.field2301 = 7; // L: 162
						}
					}
				} catch (UnsupportedEncodingException var8) { // L: 166
					this.method4142(); // L: 167
					this.field2301 = 6; // L: 168
					return; // L: 169
				}

				if (this.field2300 != null) { // L: 171
					this.field2301 = this.field2300.field2385.size() > 0 ? 1 : 2; // L: 172
				}

				this.field2307 = null; // L: 174
			}
		}
	} // L: 124 130 175

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method4144() {
		Iterator var1 = this.field2300.field2385.iterator(); // L: 178

		class211 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2300.field2385.iterator(); // L: 186

				while (var1.hasNext()) {
					var2 = (class211)var1.next(); // L: 187
					if (var2.field2311 != null) { // L: 189
						byte[] var3 = var2.field2311.getResponse(); // L: 190
						if (var3 != null && var3.length > 0) { // L: 191
							this.field2301 = 2; // L: 192
							return; // L: 193
						}
					}
				}

				this.method4142(); // L: 198
				this.field2301 = 5; // L: 199
				return; // L: 200
			}

			var2 = (class211)var1.next(); // L: 179
		} while(var2.field2311 == null || var2.field2311.isDone()); // L: 181

	} // L: 182

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;I)Z",
		garbageValue = "-871874771"
	)
	public boolean method4145(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new class481(var1.getBytes())).method8769(); // L: 204

			try {
				this.field2305 = var3.getInt("version"); // L: 206
			} catch (Exception var5) { // L: 208
				this.method4142(); // L: 209
				this.field2301 = 6; // L: 210
				return false; // L: 211
			}

			if (!this.field2300.method4304(var3, this.field2305, var2)) { // L: 213
				this.field2301 = 6; // L: 214
			}

			this.field2301 = this.field2300.field2385.size() > 0 ? 1 : 2; // L: 216
		} catch (UnsupportedEncodingException var6) { // L: 218
			this.field2301 = 6; // L: 219
		}

		return this.field2301 < 3; // L: 221
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "625151772"
	)
	static final int method4166(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 993
		var2 ^= var2 << 13; // L: 994
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE; // L: 995
		return var3 >> 19 & 255; // L: 996
	}
}
