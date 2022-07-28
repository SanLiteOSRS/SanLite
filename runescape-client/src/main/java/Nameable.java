import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	} // L: 9

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)I",
		garbageValue = "1115853399"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username); // L: 32
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)Lqi;",
		garbageValue = "42"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username; // L: 12
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1429277221"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName(); // L: 16 17
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "5"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName(); // L: 21 22
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lqi;I)V",
		garbageValue = "-1289684227"
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
