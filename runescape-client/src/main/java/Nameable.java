import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Llf;I)I",
		garbageValue = "-1545273649"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Llc;",
		garbageValue = "1609286013"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-507308651"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1933928316"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llc;Llc;I)V",
		garbageValue = "-2071487865"
	)
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.username = var1;
			this.previousUsername = var2;
		}
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((Nameable)var1);
	}
}
