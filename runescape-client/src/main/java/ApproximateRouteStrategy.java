import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("qx")
	@ObfuscatedSignature(
		descriptor = "Ly;"
	)
	static class3 field630;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -344685783
	)
	static int field629;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILfz;I)Z",
		garbageValue = "496202097"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Lcf;",
		garbageValue = "-26460885"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = UserComparator5.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = NameableContainer.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1598600139"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class170.method3554();
		ClientPacket.method4354();
		int var1 = class11.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					InterfaceParent.method2082(0.9D);
				}

				if (var2 == 2) {
					InterfaceParent.method2082(0.8D);
				}

				if (var2 == 3) {
					InterfaceParent.method2082(0.7D);
				}

				if (var2 == 4) {
					InterfaceParent.method2082(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					PacketWriter.method2402(255);
				}

				if (var2 == 1) {
					PacketWriter.method2402(192);
				}

				if (var2 == 2) {
					PacketWriter.method2402(128);
				}

				if (var2 == 3) {
					PacketWriter.method2402(64);
				}

				if (var2 == 4) {
					PacketWriter.method2402(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					WorldMapLabelSize.updateSoundEffectVolume(127);
				}

				if (var2 == 1) {
					WorldMapLabelSize.updateSoundEffectVolume(96);
				}

				if (var2 == 2) {
					WorldMapLabelSize.updateSoundEffectVolume(64);
				}

				if (var2 == 3) {
					WorldMapLabelSize.updateSoundEffectVolume(32);
				}

				if (var2 == 4) {
					WorldMapLabelSize.updateSoundEffectVolume(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
				Client.field912 = var2;
			}

			if (var1 == 10) {
				if (var2 == 0) {
					LoginPacket.method4373(127);
				}

				if (var2 == 1) {
					LoginPacket.method4373(96);
				}

				if (var2 == 2) {
					LoginPacket.method4373(64);
				}

				if (var2 == 3) {
					LoginPacket.method4373(32);
				}

				if (var2 == 4) {
					LoginPacket.method4373(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			AttackOption[] var3;
			if (var1 == 18) {
				var3 = new AttackOption[]{AttackOption.field1357, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden};
				Client.playerAttackOption = (AttackOption)Messages.findEnumerated(var3, var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				var3 = new AttackOption[]{AttackOption.field1357, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden};
				Client.npcAttackOption = (AttackOption)Messages.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
