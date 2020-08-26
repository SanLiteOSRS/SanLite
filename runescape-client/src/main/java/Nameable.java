import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("Nameable")
public class Nameable implements Comparable {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lku;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lku;"
	)
	@Export("previousUsername")
	Username previousUsername;

	Nameable() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(I)Lku;",
		garbageValue = "-53975348"
	)
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "-2094298107"
	)
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		signature = "(I)Ljava/lang/String;",
		garbageValue = "2114724515"
	)
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		signature = "(Lku;Lku;I)V",
		garbageValue = "-1201574407"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		signature = "(Ljc;I)I",
		garbageValue = "-243007320"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.username.compareToTyped(var1.username);
	}

	public int compareTo(Object var1) {
		return this.compareTo_user((Nameable)var1);
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "793231569"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = SecureRandomCallable.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			Script.runScriptEvent(var5);
		}

		Client.field834 = var3;
		Client.isSpellSelected = true;
		class232.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		UserComparator8.selectedSpellFlags = var2;
		class52.invalidateWidget(var4);
	}
}
