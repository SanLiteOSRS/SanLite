import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("BufferedSource")
public class BufferedSource implements Runnable {
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("f")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("w")
	@Export("inputStream")
	InputStream inputStream;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1210810773
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("s")
	@Export("buffer")
	byte[] buffer;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1989146679
	)
	@Export("position")
	int position;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1590838683
	)
	@Export("limit")
	int limit;
	@ObfuscatedName("i")
	@Export("exception")
	IOException exception;

	BufferedSource(InputStream var1, int var2) {
		this.position = 0; // L: 66
		this.limit = 0; // L: 67
		this.inputStream = var1; // L: 71
		this.capacity = var2 + 1; // L: 72
		this.buffer = new byte[this.capacity]; // L: 73
		this.thread = new Thread(this); // L: 74
		this.thread.setDaemon(true); // L: 75
		this.thread.start(); // L: 76
	} // L: 77

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2119015398"
	)
	@Export("isAvailable")
	boolean isAvailable(int var1) throws IOException {
		if (var1 == 0) { // L: 113
			return true;
		} else if (var1 > 0 && var1 < this.capacity) { // L: 114
			synchronized(this) { // L: 115
				int var3;
				if (this.position <= this.limit) { // L: 117
					var3 = this.limit - this.position;
				} else {
					var3 = this.capacity - this.position + this.limit; // L: 118
				}

				if (var3 < var1) { // L: 119
					if (this.exception != null) { // L: 120
						throw new IOException(this.exception.toString());
					} else {
						this.notifyAll(); // L: 121
						return false; // L: 122
					}
				} else {
					return true; // L: 124
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2130271953"
	)
	@Export("available")
	int available() throws IOException {
		synchronized(this) { // L: 129
			int var2;
			if (this.position <= this.limit) { // L: 131
				var2 = this.limit - this.position;
			} else {
				var2 = this.capacity - this.position + this.limit; // L: 132
			}

			if (var2 <= 0 && this.exception != null) { // L: 133
				throw new IOException(this.exception.toString()); // L: 134
			} else {
				this.notifyAll(); // L: 136
				return var2; // L: 137
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-114"
	)
	@Export("readUnsignedByte")
	int readUnsignedByte() throws IOException {
		synchronized(this) { // L: 142
			if (this.position == this.limit) { // L: 143
				if (this.exception != null) { // L: 144
					throw new IOException(this.exception.toString());
				} else {
					return -1; // L: 145
				}
			} else {
				int var2 = this.buffer[this.position] & 255; // L: 147
				this.position = (this.position + 1) % this.capacity; // L: 148
				this.notifyAll(); // L: 149
				return var2; // L: 150
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "583878445"
	)
	@Export("read")
	int read(byte[] var1, int var2, int var3) throws IOException {
		if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) { // L: 155
			synchronized(this) { // L: 156
				int var5;
				if (this.position <= this.limit) { // L: 158
					var5 = this.limit - this.position;
				} else {
					var5 = this.capacity - this.position + this.limit; // L: 159
				}

				if (var3 > var5) { // L: 160
					var3 = var5;
				}

				if (var3 == 0 && this.exception != null) { // L: 161
					throw new IOException(this.exception.toString());
				} else {
					if (var3 + this.position <= this.capacity) { // L: 162
						System.arraycopy(this.buffer, this.position, var1, var2, var3); // L: 163
					} else {
						int var6 = this.capacity - this.position; // L: 166
						System.arraycopy(this.buffer, this.position, var1, var2, var6); // L: 167
						System.arraycopy(this.buffer, 0, var1, var6 + var2, var3 - var6); // L: 168
					}

					this.position = (var3 + this.position) % this.capacity; // L: 170
					this.notifyAll(); // L: 171
					return var3; // L: 172
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-3422"
	)
	@Export("close")
	void close() {
		synchronized(this) { // L: 177
			if (this.exception == null) {
				this.exception = new IOException(""); // L: 178
			}

			this.notifyAll(); // L: 179
		}

		try {
			this.thread.join(); // L: 182
		} catch (InterruptedException var3) { // L: 184
		}

	} // L: 185

	public void run() {
		while (true) {
			int var1;
			synchronized(this) { // L: 82
				while (true) {
					if (this.exception != null) { // L: 84
						return;
					}

					if (this.position == 0) { // L: 85
						var1 = this.capacity - this.limit - 1;
					} else if (this.position <= this.limit) { // L: 86
						var1 = this.capacity - this.limit;
					} else {
						var1 = this.position - this.limit - 1; // L: 87
					}

					if (var1 > 0) { // L: 88
						break;
					}

					try {
						this.wait(); // L: 90
					} catch (InterruptedException var10) { // L: 92
					}
				}
			}

			int var7;
			try {
				var7 = this.inputStream.read(this.buffer, this.limit, var1); // L: 97
				if (var7 == -1) {
					throw new EOFException(); // L: 98
				}
			} catch (IOException var11) { // L: 100
				IOException var3 = var11;
				synchronized(this) { // L: 101
					this.exception = var3; // L: 102
					return; // L: 103
				}
			}

			synchronized(this) { // L: 106
				this.limit = (var7 + this.limit) % this.capacity; // L: 107
			} // L: 108
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIII)V",
		garbageValue = "-405303371"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class387.localPlayer != var0) { // L: 10738
			if (Client.menuOptionsCount < 400) { // L: 10739
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 10741
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 10742
					var7 = var0.combatLevel; // L: 10744
					int var8 = class387.localPlayer.combatLevel; // L: 10745
					int var9 = var8 - var7; // L: 10747
					String var6;
					if (var9 < -9) { // L: 10748
						var6 = class149.colorStartTag(16711680); // L: 10749
					} else if (var9 < -6) { // L: 10752
						var6 = class149.colorStartTag(16723968); // L: 10753
					} else if (var9 < -3) { // L: 10756
						var6 = class149.colorStartTag(16740352); // L: 10757
					} else if (var9 < 0) { // L: 10760
						var6 = class149.colorStartTag(16756736); // L: 10761
					} else if (var9 > 9) { // L: 10764
						var6 = class149.colorStartTag(65280); // L: 10765
					} else if (var9 > 6) { // L: 10768
						var6 = class149.colorStartTag(4259584); // L: 10769
					} else if (var9 > 3) { // L: 10772
						var6 = class149.colorStartTag(8453888); // L: 10773
					} else if (var9 > 0) { // L: 10776
						var6 = class149.colorStartTag(12648192); // L: 10777
					} else {
						var6 = class149.colorStartTag(16776960); // L: 10780
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 10782
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10784
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 10785
					WorldMapManager.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class149.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10786
				} else if (Client.isSpellSelected) { // L: 10789
					if ((class149.selectedSpellFlags & 8) == 8) { // L: 10790
						WorldMapManager.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class149.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10791
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 10796
						if (Client.playerMenuActions[var10] != null) { // L: 10797
							short var11 = 0; // L: 10798
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 10799
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10800
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class387.localPlayer.combatLevel) { // L: 10801
									var11 = 2000; // L: 10802
								}

								if (class387.localPlayer.team != 0 && var0.team != 0) { // L: 10804
									if (var0.team == class387.localPlayer.team) { // L: 10805
										var11 = 2000;
									} else {
										var11 = 0; // L: 10806
									}
								} else if (Client.playerAttackOption == AttackOption.field1318 && var0.isClanMember()) { // L: 10808
									var11 = 2000; // L: 10809
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 10812
								var11 = 2000;
							}

							boolean var12 = false; // L: 10813
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 10814
							WorldMapManager.insertMenuItemNoShift(Client.playerMenuActions[var10], class149.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 10815
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 10820
					if (Client.menuOpcodes[var10] == 23) { // L: 10821
						Client.menuTargets[var10] = class149.colorStartTag(16777215) + var4; // L: 10822
						break;
					}
				}

			}
		}
	} // L: 10826
}
