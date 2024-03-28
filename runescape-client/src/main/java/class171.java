import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("gh")
public class class171 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	class180 field1843;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	class182 field1845;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1500730581
	)
	int field1849;
	@ObfuscatedName("ai")
	String field1850;
	@ObfuscatedName("ax")
	String field1851;
	@ObfuscatedName("ar")
	String field1852;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	UrlRequest field1853;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1495997613
	)
	int field1847;

	public class171() {
		this.field1849 = -1; // L: 28
		this.field1847 = 0; // L: 33
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Lgp;",
		garbageValue = "-24"
	)
	public class180 method3440() {
		return this.field1843; // L: 36
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lea;B)Z",
		garbageValue = "-3"
	)
	public boolean method3441(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) { // L: 40
			if (var3 == null) {
				return false;
			} else {
				this.method3453();

				try {
					this.field1850 = var1; // L: 48
					this.field1853 = var3.request(new URL(this.field1850)); // L: 49
					this.field1849 = 0; // L: 50
				} catch (MalformedURLException var5) { // L: 52
					this.method3453(); // L: 53
					this.field1849 = 4; // L: 54
					return false; // L: 55
				}

				if (!var2.isEmpty()) { // L: 57
					this.field1852 = var2; // L: 58
				}

				return true; // L: 60
			}
		} else {
			return false; // L: 41
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "39"
	)
	public void method3442(String var1, String var2, String var3) {
		this.field1843 = AttackOption.method2678(); // L: 64
		this.field1851 = var1; // L: 65
		this.field1843.method3582(this.field1851, var2, var3); // L: 66
	} // L: 67

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "712461185"
	)
	public void method3481(UrlRequester var1) {
		switch(this.field1849) { // L: 70
		case 0:
			this.method3451(var1); // L: 75
			break; // L: 76
		case 1:
			this.method3489(); // L: 72
			break;
		default:
			return; // L: 78
		}

	} // L: 80

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-763487788"
	)
	public int method3444() {
		return this.field1849; // L: 83
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-494265876"
	)
	public int method3455(String var1) {
		return this.field1845.field1935.containsKey(var1) ? (Integer)this.field1845.field1935.get(var1) : -1; // L: 87
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1108927544"
	)
	public String method3446(String var1) {
		return (String)((String)(this.field1845.field1936.containsKey(var1) ? this.field1845.field1936.get(var1) : null)); // L: 91
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1380340116"
	)
	public ArrayList method3490() {
		return this.field1845.field1931; // L: 95
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1925848784"
	)
	public ArrayList method3448() {
		return this.field1845.field1930; // L: 99
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "9"
	)
	public ArrayList method3449() {
		return this.field1845.field1934; // L: 103
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1516677521"
	)
	public String method3450() {
		return this.field1845.field1932; // L: 107
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "102"
	)
	public float[] method3484() {
		return this.field1845.field1927; // L: 111
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1941310009"
	)
	public String method3452() {
		return this.field1845.method3597(); // L: 115
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-83"
	)
	void method3453() {
		this.field1853 = null; // L: 119
	} // L: 120

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lea;B)V",
		garbageValue = "80"
	)
	void method3451(UrlRequester var1) {
		if (this.field1853 != null && this.field1853.isDone()) { // L: 123
			byte[] var2 = this.field1853.getResponse(); // L: 126
			if (var2 == null) { // L: 127
				this.method3453(); // L: 128
				this.field1849 = 4; // L: 129
			} else {
				try {
					class482 var3 = new class482(var2); // L: 133
					JSONObject var4 = var3.method8552(); // L: 134
					if (var4 == null) { // L: 135
						return;
					}

					try {
						this.field1847 = var4.getInt("version"); // L: 137
					} catch (Exception var6) { // L: 139
						this.method3453(); // L: 140
						this.field1849 = 6; // L: 141
						return; // L: 142
					}

					if (this.field1847 < 2) { // L: 144
						if (!this.field1845.method3632(var4, this.field1847, var1)) { // L: 145
							this.field1849 = 6; // L: 146
						}
					} else if (this.field1847 == 2) { // L: 149
						class184 var5 = class392.method7180(); // L: 150
						var5.method3642(var4, this.field1847, var1); // L: 151
						this.field1845 = var5.method3645(this.field1852); // L: 152
						if (this.field1845 != null) { // L: 153
							this.method3489(); // L: 154
							this.field1849 = 1; // L: 155
						} else {
							this.field1849 = 7; // L: 158
						}
					}
				} catch (UnsupportedEncodingException var7) { // L: 162
					this.method3453(); // L: 163
					this.field1849 = 6; // L: 164
					return; // L: 165
				}

				if (this.field1845 != null) { // L: 167
					this.field1849 = this.field1845.field1931.size() > 0 ? 1 : 2; // L: 168
				}

				this.field1853 = null; // L: 170
			}
		}
	} // L: 124 130 171

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	void method3489() {
		Iterator var1 = this.field1845.field1931.iterator(); // L: 174

		class172 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1845.field1931.iterator(); // L: 182

				while (var1.hasNext()) {
					var2 = (class172)var1.next(); // L: 183
					if (var2.field1859 != null) { // L: 185
						byte[] var3 = var2.field1859.getResponse(); // L: 186
						if (var3 != null && var3.length > 0) { // L: 187
							this.field1849 = 2; // L: 188
							return; // L: 189
						}
					}
				}

				this.method3453(); // L: 194
				this.field1849 = 5; // L: 195
				return; // L: 196
			}

			var2 = (class172)var1.next(); // L: 175
		} while(var2.field1859 == null || var2.field1859.isDone()); // L: 177

	} // L: 178

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;I)Z",
		garbageValue = "-910615631"
	)
	public boolean method3459(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new class482(var1.getBytes())).method8552(); // L: 200

			try {
				this.field1847 = var3.getInt("version"); // L: 202
			} catch (Exception var5) { // L: 204
				this.method3453(); // L: 205
				this.field1849 = 6; // L: 206
				return false; // L: 207
			}

			if (!this.field1845.method3632(var3, this.field1847, var2)) { // L: 209
				this.field1849 = 6; // L: 210
			}

			this.field1849 = this.field1845.field1931.size() > 0 ? 1 : 2; // L: 212
		} catch (UnsupportedEncodingException var6) { // L: 214
			this.field1849 = 6; // L: 215
		}

		return this.field1849 < 3; // L: 217
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lmh;",
		garbageValue = "-657098350"
	)
	public static PacketBufferNode method3447() {
		PacketBufferNode var0 = WorldMapSection0.method5639(); // L: 42
		var0.clientPacket = null; // L: 43
		var0.clientPacketLength = 0; // L: 44
		var0.packetBuffer = new PacketBuffer(5000); // L: 45
		return var0; // L: 46
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	static final int method3467() {
		float var0 = 200.0F * ((float)NPC.clientPreferences.method2470() - 0.5F); // L: 12356
		return 100 - Math.round(var0); // L: 12357
	}
}
