import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("im")
public class class219 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final class219 field2371;
	@ObfuscatedName("aq")
	String field2367;
	@ObfuscatedName("aw")
	String field2360;
	@ObfuscatedName("al")
	String field2365;
	@ObfuscatedName("ai")
	String field2358;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -1510457450721933301L
	)
	long field2362;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	class14 field2363;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	class18 field2364;
	@ObfuscatedName("az")
	final int field2368;
	@ObfuscatedName("ao")
	final int field2359;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 597965763
	)
	int field2366;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1018674229
	)
	int field2369;
	@ObfuscatedName("an")
	String field2370;
	@ObfuscatedName("am")
	boolean field2372;

	static {
		field2371 = new class219(); // L: 30
	}

	class219() {
		this.field2367 = ""; // L: 14
		this.field2360 = ""; // L: 15
		this.field2365 = ""; // L: 16
		this.field2358 = ""; // L: 17
		this.field2362 = -1L; // L: 18
		this.field2368 = 1; // L: 21
		this.field2359 = 2; // L: 22
		this.field2366 = 1; // L: 23
		this.field2369 = 0; // L: 28
	} // L: 33

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1018900511"
	)
	public void method4262(int var1, String var2) {
		this.field2369 = var1; // L: 40
		this.field2370 = var2; // L: 41
	} // L: 42

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1351678430"
	)
	public void method4263(boolean var1) {
		this.field2372 = var1; // L: 45
		this.field2363 = new class14("crmsession", 1, 1); // L: 46
	} // L: 47

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1191721460"
	)
	void method4264(String var1, String var2, String var3) {
		if (this.field2366 != 2) { // L: 50
			this.field2367 = var1; // L: 51
			this.field2360 = var2; // L: 52
			this.field2365 = var3;
			if (!this.field2367.endsWith("/")) {
				this.field2367 = this.field2367 + "/";
			}

			if (!this.field2360.equals("")) { // L: 57
				String var4 = this.field2367; // L: 60
				var4 = var4 + "session/open/" + this.field2360;
				if (this.field2365.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2365; // L: 63

				try {
					this.field2364 = this.method4277(var4);
					this.field2362 = SecureRandomCallable.method2320();
				} catch (IOException var6) { // L: 68
					this.field2364 = null; // L: 69
					this.field2360 = ""; // L: 70
					this.field2365 = ""; // L: 71
				}

			}
		}
	} // L: 73

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1886033696"
	)
	public void method4265() {
		if (this.field2364 == null) { // L: 76
			if (!this.field2358.isEmpty() && this.field2366 == 1) { // L: 79
				long var1 = SecureRandomCallable.method2320(); // L: 80
				long var3 = var1 - this.field2362; // L: 81
				String var5 = this.field2367; // L: 82
				var5 = var5 + "session/close/" + this.field2360 + "/" + this.field2358; // L: 83
				if (this.field2365.isEmpty()) { // L: 84
					var5 = var5 + "?sessionDuration=" + var3; // L: 85
				} else {
					var5 = var5 + "?userHash=" + this.field2365 + "&sessionDuration=" + var3; // L: 88
				}

				try {
					this.field2364 = this.method4277(var5); // L: 91
				} catch (IOException var7) { // L: 93
					this.field2366 = 1; // L: 94
				}
			}

		}
	} // L: 77 97

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method4266() {
		if (this.field2363 != null) { // L: 100
			this.field2363.method166();
		}

	} // L: 101

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1756755184"
	)
	void method4289() {
		if (!this.field2358.isEmpty()) { // L: 104
			String var1 = ""; // L: 105
			switch(this.field2369) { // L: 106
			case 1:
				var1 = "events/click"; // L: 116
				break;
			case 2:
				var1 = "events/dismissed"; // L: 111
				break; // L: 112
			case 3:
				var1 = "events/impression"; // L: 108
			}

			if (!this.field2370.isEmpty()) { // L: 119
				String var2 = this.field2367; // L: 122
				var2 = var2 + var1 + "/" + this.field2360 + "/" + this.field2358 + "/" + this.field2370 + "?userHash=" + this.field2365; // L: 123

				try {
					this.field2364 = this.method4277(var2); // L: 125
				} catch (IOException var4) { // L: 127
					this.field2366 = 1; // L: 128
				}

				this.field2366 = 1; // L: 130
				this.field2369 = 0; // L: 131
			}
		}
	} // L: 120 132

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "996137810"
	)
	public void method4268() {
		if (this.field2364 != null && this.field2364.method250()) { // L: 135
			if (this.field2364.method250() && this.field2364.method239().method264() == 200 && this.field2358.isEmpty()) { // L: 138 139 140
				String var1 = this.field2364.method239().method263(); // L: 141
				if (var1.isEmpty()) { // L: 142
					return; // L: 143
				}

				this.field2358 = var1; // L: 145
			}

			if (this.field2369 != 0) { // L: 150
				this.method4289(); // L: 151
			}

		}
	} // L: 136 153

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1524563464"
	)
	public boolean method4274(String var1) {
		this.method4262(2, var1); // L: 156
		return true; // L: 157
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lad;",
		garbageValue = "-25"
	)
	class18 method4277(String var1) throws IOException {
		URL var2 = new URL(var1); // L: 161
		class10 var3 = new class10(var2, class9.field28, this.field2372); // L: 162

		try {
			JSONObject var4 = new JSONObject(); // L: 164
			var3.method86(new class481(var4)); // L: 165
		} catch (Exception var5) { // L: 167
		}

		return this.field2363.method158(var3); // L: 168
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2011298012"
	)
	static int method4299(int var0, int var1) {
		if (var0 == -2) { // L: 53
			return 12345678;
		} else if (var0 == -1) { // L: 54
			if (var1 < 0) { // L: 55
				var1 = 0; // L: 56
			} else if (var1 > 127) { // L: 58
				var1 = 127; // L: 59
			}

			var1 = 127 - var1; // L: 61
			return var1; // L: 62
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 64
			if (var1 < 2) { // L: 65
				var1 = 2;
			} else if (var1 > 126) { // L: 66
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 67
		}
	}
}
