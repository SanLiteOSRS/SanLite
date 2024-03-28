import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	} // L: 9

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrr;B)I",
		garbageValue = "25"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username); // L: 32
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lvx;",
		garbageValue = "-1286664832"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 12
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2018470235"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 16 17
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1700842473"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 21 22
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lvx;Lvx;I)V",
		garbageValue = "1675573997"
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
}
