import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ia")
public class class217 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static final class217 field2340;
	@ObfuscatedName("am")
	String field2335;
	@ObfuscatedName("ap")
	String field2336;
	@ObfuscatedName("af")
	String field2332;
	@ObfuscatedName("aj")
	String field2329;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 2844132262259161439L
	)
	long field2330;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	class14 field2331;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	class18 field2326;
	@ObfuscatedName("ao")
	final int field2333;
	@ObfuscatedName("ae")
	final int field2334;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1486415097
	)
	int field2327;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 873198811
	)
	int field2338;
	@ObfuscatedName("az")
	String field2339;

	static {
		field2340 = new class217(); // L: 30
	}

	class217() {
		this.field2335 = ""; // L: 14
		this.field2336 = ""; // L: 15
		this.field2332 = ""; // L: 16
		this.field2329 = ""; // L: 17
		this.field2330 = -1L; // L: 18
		this.field2333 = 1; // L: 21
		this.field2334 = 2;
		this.field2327 = 1;
		this.field2338 = 0; // L: 28
	} // L: 32

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "24159"
	)
	public void method4280(int var1, String var2) {
		this.field2338 = var1; // L: 39
		this.field2339 = var2; // L: 40
	} // L: 41

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1146779871"
	)
	public void method4281() {
		this.field2331 = new class14("crmsession", 1, 1); // L: 44
	} // L: 45

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2090067408"
	)
	void method4282(String var1, String var2, String var3) {
		if (this.field2327 != 2) { // L: 48
			this.field2335 = var1; // L: 49
			this.field2336 = var2; // L: 50
			this.field2332 = var3; // L: 51
			if (!this.field2335.endsWith("/")) {
				this.field2335 = this.field2335 + "/";
			}

			if (!this.field2336.equals("")) { // L: 55
				String var4 = this.field2335; // L: 58
				var4 = var4 + "session/open/" + this.field2336; // L: 59
				if (this.field2332.equals("")) { // L: 60
				}

				var4 = var4 + "?userHash=" + this.field2332; // L: 61

				try {
					this.field2326 = this.method4288(var4); // L: 63
					this.field2330 = UserComparator9.method2973(); // L: 64
				} catch (IOException var6) { // L: 66
					this.field2326 = null; // L: 67
					this.field2336 = ""; // L: 68
					this.field2332 = ""; // L: 69
				}

			}
		}
	} // L: 56 71

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "19714"
	)
	public void method4283() {
		if (this.field2326 == null) { // L: 74
			if (!this.field2329.isEmpty() && this.field2327 == 1) { // L: 77
				long var1 = UserComparator9.method2973(); // L: 78
				long var3 = var1 - this.field2330; // L: 79
				String var5 = this.field2335; // L: 80
				var5 = var5 + "session/close/" + this.field2336 + "/" + this.field2329; // L: 81
				if (this.field2332.isEmpty()) { // L: 82
					var5 = var5 + "?sessionDuration=" + var3; // L: 83
				} else {
					var5 = var5 + "?userHash=" + this.field2332 + "&sessionDuration=" + var3; // L: 86
				}

				try {
					this.field2326 = this.method4288(var5); // L: 89
				} catch (IOException var7) { // L: 91
					this.field2327 = 1; // L: 92
				}
			}

		}
	} // L: 75 95

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-433540191"
	)
	public void method4284() {
		this.field2331.method181(); // L: 98
	} // L: 99

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-79"
	)
	void method4285() {
		if (!this.field2329.isEmpty()) { // L: 102
			String var1 = ""; // L: 103
			switch(this.field2338) { // L: 104
			case 1:
				var1 = "events/click"; // L: 112
				break;
			case 2:
				var1 = "events/dismissed"; // L: 109
				break; // L: 110
			case 3:
				var1 = "events/impression"; // L: 106
			}

			if (!this.field2339.isEmpty()) { // L: 117
				String var2 = this.field2335; // L: 120
				var2 = var2 + var1 + "/" + this.field2336 + "/" + this.field2329 + "/" + this.field2339 + "?userHash=" + this.field2332; // L: 121

				try {
					this.field2326 = this.method4288(var2); // L: 123
				} catch (IOException var4) { // L: 125
					this.field2327 = 1; // L: 126
				}

				this.field2327 = 1; // L: 128
				this.field2338 = 0; // L: 129
			}
		}
	} // L: 118 130

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1661390703"
	)
	public void method4286() {
		if (this.field2326 != null && this.field2326.method277()) { // L: 133
			if (this.field2326.method277() && this.field2326.method288().method302() == 200 && this.field2329.isEmpty()) { // L: 136 137 138
				String var1 = this.field2326.method288().method304(); // L: 139
				if (var1.isEmpty()) { // L: 140
					return; // L: 141
				}

				this.field2329 = var1; // L: 143
			}

			if (this.field2338 != 0) { // L: 148
				this.method4285(); // L: 149
			}

		}
	} // L: 134 151

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "933249240"
	)
	public boolean method4308(String var1) {
		this.method4280(2, var1); // L: 154
		return true; // L: 155
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lay;",
		garbageValue = "-104"
	)
	class18 method4288(String var1) throws IOException {
		URL var2 = new URL(var1); // L: 159
		class10 var3 = new class10(var2, class9.field21); // L: 160

		try {
			JSONObject var4 = new JSONObject(); // L: 162
			var3.method82(new class478(var4)); // L: 163
		} catch (Exception var5) { // L: 165
		}

		return this.field2331.method180(var3); // L: 166
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "-80"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		class353.method6906(var0, var1, "openjs", var2); // L: 22
	} // L: 23

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Low;III)[Luc;",
		garbageValue = "-52378629"
	)
	public static SpritePixels[] method4289(AbstractArchive var0, int var1, int var2) {
		return !Varcs.method2829(var0, var1, var2) ? null : ItemComposition.method4054(); // L: 52 53
	}
}
