import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
public class class398 {
	@ObfuscatedName("gy")
	@ObfuscatedGetter(
		intValue = 1494034165
	)
	static int field4505;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	class394 field4502;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 751881255
	)
	int field4503;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1020129413
	)
	int field4504;

	@ObfuscatedSignature(
		descriptor = "(Lpj;II)V"
	)
	class398(class394 var1, int var2, int var3) {
		this.field4503 = 0; // L: 7
		this.field4504 = 0; // L: 8
		this.field4502 = var1; // L: 11
		this.field4503 = var2; // L: 12
		this.field4504 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public String method7542() {
		if (this.method7544()) { // L: 17
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7545()); // L: 18

			for (int var2 = this.field4503; var2 < this.field4504; ++var2) { // L: 19
				class396 var3 = this.field4502.method7303(var2); // L: 20
				var1.append(var3.field4476); // L: 21
			}

			return var1.toString(); // L: 23
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method7555(int var1) {
		return this.field4502.method7308() == 2 || this.field4502.method7308() == 1 && (!this.field4502.field4466 || this.field4504 - 1 != var1); // L: 27
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "181871891"
	)
	public boolean method7544() {
		return this.field4503 == this.field4504; // L: 31
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1557600445"
	)
	public int method7545() {
		return this.field4504 - this.field4503; // L: 35
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpz;I)Z",
		garbageValue = "-663348628"
	)
	boolean method7546(class396 var1) {
		if (this.field4502.field4468 == 2) { // L: 39
			return true;
		} else if (this.field4502.field4468 == 0) { // L: 40
			return false;
		} else {
			return this.field4502.method7276() != var1; // L: 41
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-808768391"
	)
	int method7550() {
		if (this.method7544()) { // L: 46
			return 0;
		} else {
			class396 var1 = this.field4502.method7303(this.field4504 - 1); // L: 47
			if (var1.field4476 == '\n') { // L: 48
				return 0;
			} else if (this.method7546(var1)) {
				return this.field4502.field4465.advances[42]; // L: 49
			} else {
				int var2 = this.field4502.field4465.advances[var1.field4476]; // L: 50
				if (var2 == 0) { // L: 51
					return var1.field4476 == '\t' ? this.field4502.field4465.advances[32] * 3 : this.field4502.field4465.advances[32]; // L: 52 53 56
				} else {
					return var2; // L: 60
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lss;",
		garbageValue = "-873357566"
	)
	public class485 method7553() {
		if (this.method7544()) { // L: 65
			return new class485(0, 0); // L: 66
		} else {
			class396 var1 = this.field4502.method7303(this.field4504 - 1); // L: 68
			return new class485(var1.field4475 + this.method7550(), var1.field4478); // L: 69
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lpz;",
		garbageValue = "602399469"
	)
	public class396 method7549(int var1) {
		return var1 >= 0 && var1 < this.method7545() ? this.field4502.method7303(this.field4503 + var1) : null; // L: 73 74
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-46"
	)
	static boolean method7558(int var0) {
		for (int var1 = 0; var1 < Client.field766; ++var1) { // L: 11938
			if (Client.field768[var1] == var0) { // L: 11939
				return true;
			}
		}

		return false; // L: 11941
	}
}
