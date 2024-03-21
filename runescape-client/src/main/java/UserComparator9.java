import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;B)I",
		garbageValue = "-99"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lsr;",
		garbageValue = "73"
	)
	public static class469 method2965() {
		synchronized(class469.field4845) { // L: 25
			if (class469.field4842 == 0) { // L: 26
				return new class469();
			} else {
				class469.field4845[--class469.field4842].method8627(); // L: 28
				return class469.field4845[class469.field4842]; // L: 29
			}
		}
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(Lng;B)Ljava/lang/String;",
		garbageValue = "-127"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (TextureProvider.Widget_unpackTargetMask(class429.getWidgetFlags(var0)) == 0) { // L: 12784
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null; // L: 12785 12786 12788
		}
	}
}
