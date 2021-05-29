import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -727989945
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 662711357
	)
	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1127510877
	)
	@Export("y")
	int y;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 643320237
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1924609359
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = 1374506562499121997L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1331667357
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIZI)V",
		garbageValue = "-2076246411"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, boolean var6) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuShiftClick[Client.menuOptionsCount] = var6;
				++Client.menuOptionsCount;
			}

		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)Ljava/lang/String;",
		garbageValue = "-502869844"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (AttackOption.Widget_unpackTargetMask(class21.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
