import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class396 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	class392 field4467;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 629369283
	)
	int field4470;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 565044829
	)
	int field4469;

	@ObfuscatedSignature(
		descriptor = "(Lpk;II)V"
	)
	class396(class392 var1, int var2, int var3) {
		this.field4470 = 0; // L: 7
		this.field4469 = 0; // L: 8
		this.field4467 = var1; // L: 11
		this.field4470 = var2; // L: 12
		this.field4469 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-75"
	)
	public String method7529() {
		if (this.method7531()) { // L: 17
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7549()); // L: 18

			for (int var2 = this.field4470; var2 < this.field4469; ++var2) { // L: 19
				class394 var3 = this.field4467.method7262(var2); // L: 20
				var1.append(var3.field4438); // L: 21
			}

			return var1.toString(); // L: 23
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "757218987"
	)
	boolean method7542(int var1) {
		return this.field4467.method7378() == 2 || this.field4467.method7378() == 1 && (!this.field4467.field4428 || this.field4469 - 1 != var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method7531() {
		return this.field4469 == this.field4470;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-398217773"
	)
	public int method7549() {
		return this.field4469 - this.field4470; // L: 35
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lpb;I)Z",
		garbageValue = "1875232175"
	)
	boolean method7533(class394 var1) {
		if (this.field4467.field4432 == 2) { // L: 39
			return true;
		} else if (this.field4467.field4432 == 0) { // L: 40
			return false;
		} else {
			return this.field4467.method7263() != var1; // L: 41
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1575995118"
	)
	int method7534() {
		if (this.method7531()) { // L: 46
			return 0;
		} else {
			class394 var1 = this.field4467.method7262(this.field4469 - 1); // L: 47
			if (var1.field4438 == '\n') { // L: 48
				return 0;
			} else if (this.method7533(var1)) {
				return this.field4467.field4431.advances[42]; // L: 49
			} else {
				int var2 = this.field4467.field4431.advances[var1.field4438]; // L: 50
				if (var2 == 0) { // L: 51
					return var1.field4438 == '\t' ? this.field4467.field4431.advances[32] * 3 : this.field4467.field4431.advances[32]; // L: 52 53 56
				} else {
					return var2; // L: 60
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lsf;",
		garbageValue = "1159401741"
	)
	public class473 method7541() {
		if (this.method7531()) { // L: 65
			return new class473(0, 0); // L: 66
		} else {
			class394 var1 = this.field4467.method7262(this.field4469 - 1); // L: 68
			return new class473(var1.field4441 + this.method7534(), var1.field4440); // L: 69
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lpb;",
		garbageValue = "1223310421"
	)
	public class394 method7536(int var1) {
		return var1 >= 0 && var1 < this.method7549() ? this.field4467.method7262(this.field4470 + var1) : null; // L: 73 74
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Lqp;",
		garbageValue = "660938077"
	)
	public static class438 method7554() {
		synchronized(class438.field4682) { // L: 27
			if (class438.field4684 == 0) { // L: 28
				return new class438();
			} else {
				class438.field4682[--class438.field4684].method8098(); // L: 30
				return class438.field4682[class438.field4684]; // L: 31
			}
		}
	}
}
