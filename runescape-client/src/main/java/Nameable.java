import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	} // L: 9

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lra;B)I",
		garbageValue = "-67"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username); // L: 32
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lvn;",
		garbageValue = "1266225248"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 12
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "385300674"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 16 17
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2095047571"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 21 22
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lvn;Lvn;B)V",
		garbageValue = "-106"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) { // L: 26
			throw new NullPointerException();
		} else {
			this.username = var1; // L: 27
			this.previousUsername = var2; // L: 28
		}
	} // L: 29

	public int compareTo(Object var1) {
		return this.compareTo_user((Nameable)var1); // L: 36
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	static void method8331(int var0) {
		if (var0 != -1) { // L: 5354
			if (ArchiveLoader.field1070.method6437(var0)) { // L: 5355
				Widget[] var1 = ArchiveLoader.field1070.field3633[var0]; // L: 5356

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 5357
					Widget var3 = var1[var2]; // L: 5358
					if (var3.onLoad != null) { // L: 5359
						ScriptEvent var4 = new ScriptEvent(); // L: 5360
						var4.widget = var3; // L: 5361
						var4.args = var3.onLoad; // L: 5362
						class425.runScript(var4, 5000000, 0); // L: 5363
					}
				}

			}
		}
	} // L: 5366
}
