import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("h")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Loa;Loa;I)I",
		garbageValue = "-1617310498"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public static boolean method2867(int var0) {
		return (var0 >> 31 & 1) != 0; // L: 25
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "([Lkd;II)V",
		garbageValue = "1689586583"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 12091
			Widget var3 = var0[var2]; // L: 12092
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !FriendSystem.isComponentHidden(var3))) { // L: 12093 12094 12095
				int var5;
				if (var3.type == 0) { // L: 12096
					if (!var3.isIf3 && FriendSystem.isComponentHidden(var3) && var3 != WorldMapScaleHandler.mousedOverWidgetIf1) { // L: 12097
						continue;
					}

					drawModelComponents(var0, var3.id); // L: 12098
					if (var3.children != null) { // L: 12099
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 12100
					if (var4 != null) { // L: 12101
						var5 = var4.group; // L: 12102
						if (Players.loadInterface(var5)) { // L: 12104
							drawModelComponents(class71.Widget_interfaceComponents[var5], -1); // L: 12105
						}
					}
				}

				if (var3.type == 6) { // L: 12109
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) { // L: 12110
						boolean var8 = class26.runCs1(var3); // L: 12111
						if (var8) { // L: 12113
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId; // L: 12114
						}

						if (var5 != -1) { // L: 12115
							SequenceDefinition var6 = class216.SequenceDefinition_get(var5); // L: 12116
							if (!var6.isCachedModelIdSet()) { // L: 12117
								for (var3.modelFrameCycle += Client.field563; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class69.invalidateWidget(var3)) { // L: 12118 12119 12126
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame]; // L: 12120
									++var3.modelFrame; // L: 12121
									if (var3.modelFrame >= var6.frameIds.length) { // L: 12122
										var3.modelFrame -= var6.frameCount; // L: 12123
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) { // L: 12124
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.field563; // L: 12130
								int var7 = var6.method4024(); // L: 12131
								if (var3.modelFrame >= var7) { // L: 12132
									var3.modelFrame -= var6.frameCount; // L: 12133
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) { // L: 12134
										var3.modelFrame = 0;
									}
								}

								class69.invalidateWidget(var3); // L: 12136
							}
						}
					}

					if (var3.field3598 != 0 && !var3.isIf3) { // L: 12140
						int var9 = var3.field3598 >> 16; // L: 12141
						var5 = var3.field3598 << 16 >> 16; // L: 12142
						var9 *= Client.field563; // L: 12143
						var5 *= Client.field563; // L: 12144
						var3.modelAngleX = var9 + var3.modelAngleX & 2047; // L: 12145
						var3.modelAngleY = var5 + var3.modelAngleY & 2047; // L: 12146
						class69.invalidateWidget(var3); // L: 12147
					}
				}
			}
		}

	} // L: 12151
}
