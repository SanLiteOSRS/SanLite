import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
public class class308 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "([Liv;IB)V",
		garbageValue = "-64"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !class11.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && class11.isComponentHidden(var3) && var3 != SpriteMask.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						var5 = var4.group;
						if (UserComparator8.loadInterface(var5)) {
							drawModelComponents(Widget.Widget_interfaceComponents[var5], -1);
						}
					}
				}

				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = class373.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = Player.SequenceDefinition_get(var5);

							for (var3.modelFrameCycle += Client.field768; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; VerticalAlignment.invalidateWidget(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}

					if (var3.field3020 != 0 && !var3.isIf3) {
						int var8 = var3.field3020 >> 16;
						var5 = var3.field3020 << 16 >> 16;
						var8 *= Client.field768;
						var5 *= Client.field768;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						VerticalAlignment.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
