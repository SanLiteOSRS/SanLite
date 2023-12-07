import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
	@ObfuscatedName("at")
	@Export("reversed")
	final boolean reversed;

	public UserComparator5(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrh;Lrh;I)I",
		garbageValue = "-405710173"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0) { // L: 14
			if (var2.world == 0) { // L: 15
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world != 0) {
			return this.reversed ? 1 : -1; // L: 18
		}

		return this.compareUser(var1, var2); // L: 20
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 24
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "([Lnn;IB)V",
		garbageValue = "58"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12053
			Widget var3 = var0[var2]; // L: 12054
			if (var3 != null) { // L: 12055
				if (var3.type == 0) { // L: 12056
					if (var3.children != null) { // L: 12057
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12058
					if (var4 != null) { // L: 12059
						class514.method9131(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 12061
					var5 = new ScriptEvent(); // L: 12062
					var5.widget = var3; // L: 12063
					var5.args = var3.onDialogAbort; // L: 12064
					class157.runScriptEvent(var5); // L: 12065
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 12067
					if (var3.childIndex >= 0) { // L: 12068
						Widget var6 = HealthBarDefinition.field1877.method6285(var3.id); // L: 12069
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 12070
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 12074
					var5.widget = var3; // L: 12075
					var5.args = var3.onSubChange; // L: 12076
					class157.runScriptEvent(var5); // L: 12077
				}
			}
		}

	} // L: 12080
}
