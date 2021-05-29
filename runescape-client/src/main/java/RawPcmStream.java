import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("v")
	int field480;
	@ObfuscatedName("n")
	int field479;
	@ObfuscatedName("f")
	int field481;
	@ObfuscatedName("y")
	int field478;
	@ObfuscatedName("p")
	int field488;
	@ObfuscatedName("j")
	int field483;
	@ObfuscatedName("r")
	int field484;
	@ObfuscatedName("b")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("d")
	@Export("start")
	int start;
	@ObfuscatedName("s")
	@Export("end")
	int end;
	@ObfuscatedName("u")
	boolean field482;
	@ObfuscatedName("l")
	int field489;
	@ObfuscatedName("o")
	int field490;
	@ObfuscatedName("c")
	int field491;
	@ObfuscatedName("e")
	int field492;

	@ObfuscatedSignature(
		descriptor = "(Lau;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field482 = var1.field399;
		this.field479 = var2;
		this.field481 = var3;
		this.field478 = var4;
		this.field480 = 0;
		this.method843();
	}

	@ObfuscatedSignature(
		descriptor = "(Lau;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field482 = var1.field399;
		this.field479 = var2;
		this.field481 = var3;
		this.field478 = 8192;
		this.field480 = 0;
		this.method843();
	}

	@ObfuscatedName("p")
	void method843() {
		this.field488 = this.field481;
		this.field483 = method892(this.field481, this.field478);
		this.field484 = method949(this.field481, this.field478);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "()Lbm;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("b")
	protected int vmethod4610() {
		return this.field481 == 0 && this.field489 == 0 ? 0 : 1;
	}

	@ObfuscatedName("d")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field481 == 0 && this.field489 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field480 < 0) {
				if (this.field479 <= 0) {
					this.method852();
					this.remove();
					return;
				}

				this.field480 = 0;
			}

			if (this.field480 >= var7) {
				if (this.field479 >= 0) {
					this.method852();
					this.remove();
					return;
				}

				this.field480 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field482) {
					if (this.field479 < 0) {
						var9 = this.method866(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field480 >= var5) {
							return;
						}

						this.field480 = var5 + var5 - 1 - this.field480;
						this.field479 = -this.field479;
					}

					while (true) {
						var9 = this.method865(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field480 < var6) {
							return;
						}

						this.field480 = var6 + var6 - 1 - this.field480;
						this.field479 = -this.field479;
						var9 = this.method866(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field480 >= var5) {
							return;
						}

						this.field480 = var5 + var5 - 1 - this.field480;
						this.field479 = -this.field479;
					}
				} else if (this.field479 < 0) {
					while (true) {
						var9 = this.method866(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field480 >= var5) {
							return;
						}

						this.field480 = var6 - 1 - (var6 - 1 - this.field480) % var8;
					}
				} else {
					while (true) {
						var9 = this.method865(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field480 < var6) {
							return;
						}

						this.field480 = var5 + (this.field480 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field482) {
						label127: {
							if (this.field479 < 0) {
								var9 = this.method866(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field480 >= var5) {
									return;
								}

								this.field480 = var5 + var5 - 1 - this.field480;
								this.field479 = -this.field479;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method865(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field480 < var6) {
									return;
								}

								this.field480 = var6 + var6 - 1 - this.field480;
								this.field479 = -this.field479;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method866(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field480 >= var5) {
									return;
								}

								this.field480 = var5 + var5 - 1 - this.field480;
								this.field479 = -this.field479;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field479 < 0) {
							while (true) {
								var9 = this.method866(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field480 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field480) / var8;
								if (var10 >= this.numLoops) {
									this.field480 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field480 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method865(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field480 < var6) {
									return;
								}

								var10 = (this.field480 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field480 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field480 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field479 < 0) {
					this.method866(var1, var9, 0, var3, 0);
					if (this.field480 < 0) {
						this.field480 = -1;
						this.method852();
						this.remove();
					}
				} else {
					this.method865(var1, var9, var7, var3, 0);
					if (this.field480 >= var7) {
						this.field480 = var7;
						this.method852();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("s")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("u")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field489 > 0) {
			if (var1 >= this.field489) {
				if (this.field481 == Integer.MIN_VALUE) {
					this.field481 = 0;
					this.field484 = 0;
					this.field483 = 0;
					this.field488 = 0;
					this.remove();
					var1 = this.field489;
				}

				this.field489 = 0;
				this.method843();
			} else {
				this.field488 += this.field490 * var1;
				this.field483 += this.field491 * var1;
				this.field484 += this.field492 * var1;
				this.field489 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field480 < 0) {
			if (this.field479 <= 0) {
				this.method852();
				this.remove();
				return;
			}

			this.field480 = 0;
		}

		if (this.field480 >= var5) {
			if (this.field479 >= 0) {
				this.method852();
				this.remove();
				return;
			}

			this.field480 = var5 - 1;
		}

		this.field480 += this.field479 * var1;
		if (this.numLoops < 0) {
			if (!this.field482) {
				if (this.field479 < 0) {
					if (this.field480 >= var3) {
						return;
					}

					this.field480 = var4 - 1 - (var4 - 1 - this.field480) % var6;
				} else {
					if (this.field480 < var4) {
						return;
					}

					this.field480 = var3 + (this.field480 - var3) % var6;
				}

			} else {
				if (this.field479 < 0) {
					if (this.field480 >= var3) {
						return;
					}

					this.field480 = var3 + var3 - 1 - this.field480;
					this.field479 = -this.field479;
				}

				while (this.field480 >= var4) {
					this.field480 = var4 + var4 - 1 - this.field480;
					this.field479 = -this.field479;
					if (this.field480 >= var3) {
						return;
					}

					this.field480 = var3 + var3 - 1 - this.field480;
					this.field479 = -this.field479;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field482) {
					label129: {
						if (this.field479 < 0) {
							if (this.field480 >= var3) {
								return;
							}

							this.field480 = var3 + var3 - 1 - this.field480;
							this.field479 = -this.field479;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field480 < var4) {
								return;
							}

							this.field480 = var4 + var4 - 1 - this.field480;
							this.field479 = -this.field479;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field480 >= var3) {
								return;
							}

							this.field480 = var3 + var3 - 1 - this.field480;
							this.field479 = -this.field479;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field479 < 0) {
							if (this.field480 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field480) / var6;
							if (var7 >= this.numLoops) {
								this.field480 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field480 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field480 < var4) {
								return;
							}

							var7 = (this.field480 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field480 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field480 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field479 < 0) {
				if (this.field480 < 0) {
					this.field480 = -1;
					this.method852();
					this.remove();
				}
			} else if (this.field480 >= var5) {
				this.field480 = var5;
				this.method852();
				this.remove();
			}

		}
	}

	@ObfuscatedName("l")
	public synchronized void method845(int var1) {
		this.method847(var1 << 6, this.method971());
	}

	@ObfuscatedName("o")
	synchronized void method846(int var1) {
		this.method847(var1, this.method971());
	}

	@ObfuscatedName("c")
	synchronized void method847(int var1, int var2) {
		this.field481 = var1;
		this.field478 = var2;
		this.field489 = 0;
		this.method843();
	}

	@ObfuscatedName("e")
	public synchronized int method914() {
		return this.field481 == Integer.MIN_VALUE ? 0 : this.field481;
	}

	@ObfuscatedName("g")
	public synchronized int method971() {
		return this.field478 < 0 ? -1 : this.field478;
	}

	@ObfuscatedName("a")
	public synchronized void method900(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field480 = var1;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method888() {
		this.field479 = (this.field479 ^ this.field479 >> 31) + (this.field479 >>> 31);
		this.field479 = -this.field479;
	}

	@ObfuscatedName("m")
	void method852() {
		if (this.field489 != 0) {
			if (this.field481 == Integer.MIN_VALUE) {
				this.field481 = 0;
			}

			this.field489 = 0;
			this.method843();
		}

	}

	@ObfuscatedName("x")
	public synchronized void method853(int var1, int var2) {
		this.method983(var1, var2, this.method971());
	}

	@ObfuscatedName("z")
	public synchronized void method983(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method847(var2, var3);
		} else {
			int var4 = method892(var2, var3);
			int var5 = method949(var2, var3);
			if (var4 == this.field483 && var5 == this.field484) {
				this.field489 = 0;
			} else {
				int var6 = var2 - this.field488;
				if (this.field488 - var2 > var6) {
					var6 = this.field488 - var2;
				}

				if (var4 - this.field483 > var6) {
					var6 = var4 - this.field483;
				}

				if (this.field483 - var4 > var6) {
					var6 = this.field483 - var4;
				}

				if (var5 - this.field484 > var6) {
					var6 = var5 - this.field484;
				}

				if (this.field484 - var5 > var6) {
					var6 = this.field484 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field489 = var1;
				this.field481 = var2;
				this.field478 = var3;
				this.field490 = (var2 - this.field488) / var1;
				this.field491 = (var4 - this.field483) / var1;
				this.field492 = (var5 - this.field484) / var1;
			}
		}
	}

	@ObfuscatedName("w")
	public synchronized void method855(int var1) {
		if (var1 == 0) {
			this.method846(0);
			this.remove();
		} else if (this.field483 == 0 && this.field484 == 0) {
			this.field489 = 0;
			this.field481 = 0;
			this.field488 = 0;
			this.remove();
		} else {
			int var2 = -this.field488;
			if (this.field488 > var2) {
				var2 = this.field488;
			}

			if (-this.field483 > var2) {
				var2 = -this.field483;
			}

			if (this.field483 > var2) {
				var2 = this.field483;
			}

			if (-this.field484 > var2) {
				var2 = -this.field484;
			}

			if (this.field484 > var2) {
				var2 = this.field484;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field489 = var1;
			this.field481 = Integer.MIN_VALUE;
			this.field490 = -this.field488 / var1;
			this.field491 = -this.field483 / var1;
			this.field492 = -this.field484 / var1;
		}
	}

	@ObfuscatedName("t")
	public synchronized void method959(int var1) {
		if (this.field479 < 0) {
			this.field479 = -var1;
		} else {
			this.field479 = var1;
		}

	}

	@ObfuscatedName("h")
	public synchronized int method857() {
		return this.field479 < 0 ? -this.field479 : this.field479;
	}

	@ObfuscatedName("ag")
	public boolean method848() {
		return this.field480 < 0 || this.field480 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("ax")
	public boolean method859() {
		return this.field489 != 0;
	}

	@ObfuscatedName("as")
	int method865(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field489 > 0) {
				int var6 = var2 + this.field489;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field489 += var2;
				if (this.field479 == 256 && (this.field480 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method877(0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field483, this.field484, this.field491, this.field492, 0, var6, var3, this);
					} else {
						var2 = method876(((RawSound)super.sound).samples, var1, this.field480, var2, this.field488, this.field490, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method962(0, 0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field483, this.field484, this.field491, this.field492, 0, var6, var3, this, this.field479, var5);
				} else {
					var2 = method966(0, 0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field488, this.field490, 0, var6, var3, this, this.field479, var5);
				}

				this.field489 -= var2;
				if (this.field489 != 0) {
					return var2;
				}

				if (!this.method867()) {
					continue;
				}

				return var4;
			}

			if (this.field479 == 256 && (this.field480 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method869(0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field483, this.field484, 0, var4, var3, this);
				}

				return method868(((RawSound)super.sound).samples, var1, this.field480, var2, this.field488, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method873(0, 0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field483, this.field484, 0, var4, var3, this, this.field479, var5);
			}

			return method872(0, 0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field488, 0, var4, var3, this, this.field479, var5);
		}
	}

	@ObfuscatedName("av")
	int method866(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field489 > 0) {
				int var6 = var2 + this.field489;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field489 += var2;
				if (this.field479 == -256 && (this.field480 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method879(0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field483, this.field484, this.field491, this.field492, 0, var6, var3, this);
					} else {
						var2 = method878(((RawSound)super.sound).samples, var1, this.field480, var2, this.field488, this.field490, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method917(0, 0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field483, this.field484, this.field491, this.field492, 0, var6, var3, this, this.field479, var5);
				} else {
					var2 = method856(0, 0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field488, this.field490, 0, var6, var3, this, this.field479, var5);
				}

				this.field489 -= var2;
				if (this.field489 != 0) {
					return var2;
				}

				if (!this.method867()) {
					continue;
				}

				return var4;
			}

			if (this.field479 == -256 && (this.field480 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method871(0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field483, this.field484, 0, var4, var3, this);
				}

				return method870(((RawSound)super.sound).samples, var1, this.field480, var2, this.field488, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method875(0, 0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field483, this.field484, 0, var4, var3, this, this.field479, var5);
			}

			return method840(0, 0, ((RawSound)super.sound).samples, var1, this.field480, var2, this.field488, 0, var4, var3, this, this.field479, var5);
		}
	}

	@ObfuscatedName("ac")
	boolean method867() {
		int var1 = this.field481;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method892(var1, this.field478);
			var3 = method949(var1, this.field478);
		}

		if (var1 == this.field488 && var2 == this.field483 && var3 == this.field484) {
			if (this.field481 == Integer.MIN_VALUE) {
				this.field481 = 0;
				this.field484 = 0;
				this.field483 = 0;
				this.field488 = 0;
				this.remove();
				return true;
			} else {
				this.method843();
				return false;
			}
		} else {
			if (this.field488 < var1) {
				this.field490 = 1;
				this.field489 = var1 - this.field488;
			} else if (this.field488 > var1) {
				this.field490 = -1;
				this.field489 = this.field488 - var1;
			} else {
				this.field490 = 0;
			}

			if (this.field483 < var2) {
				this.field491 = 1;
				if (this.field489 == 0 || this.field489 > var2 - this.field483) {
					this.field489 = var2 - this.field483;
				}
			} else if (this.field483 > var2) {
				this.field491 = -1;
				if (this.field489 == 0 || this.field489 > this.field483 - var2) {
					this.field489 = this.field483 - var2;
				}
			} else {
				this.field491 = 0;
			}

			if (this.field484 < var3) {
				this.field492 = 1;
				if (this.field489 == 0 || this.field489 > var3 - this.field484) {
					this.field489 = var3 - this.field484;
				}
			} else if (this.field484 > var3) {
				this.field492 = -1;
				if (this.field489 == 0 || this.field489 > this.field484 - var3) {
					this.field489 = this.field484 - var3;
				}
			} else {
				this.field492 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("ah")
	int vmethod987() {
		int var1 = this.field488 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field480 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("v")
	static int method892(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("n")
	static int method949(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lau;II)Lbv;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field428 * 2205000)), var2 << 6) : null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lau;III)Lbv;"
	)
	public static RawPcmStream method842(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbv;)I"
	)
	static int method868(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field480 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbv;)I"
	)
	static int method869(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field480 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbv;)I"
	)
	static int method870(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field480 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbv;)I"
	)
	static int method871(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field480 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbv;II)I"
	)
	static int method872(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field480 = var4;
		return var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbv;II)I"
	)
	static int method873(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field480 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbv;II)I"
	)
	static int method840(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field480 = var4;
		return var5;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbv;II)I"
	)
	static int method875(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field480 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbv;)I"
	)
	static int method876(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field483 += var9.field491 * (var6 - var3);
		var9.field484 += var9.field492 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field488 = var4 >> 2;
		var9.field480 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbv;)I"
	)
	static int method877(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field488 += var12.field490 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field483 = var5 >> 2;
		var12.field484 = var6 >> 2;
		var12.field480 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbv;)I"
	)
	static int method878(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field483 += var9.field491 * (var6 - var3);
		var9.field484 += var9.field492 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field488 = var4 >> 2;
		var9.field480 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbv;)I"
	)
	static int method879(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field488 += var12.field490 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field483 = var5 >> 2;
		var12.field484 = var6 >> 2;
		var12.field480 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbv;II)I"
	)
	static int method966(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field483 -= var11.field491 * var5;
		var11.field484 -= var11.field492 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field483 += var11.field491 * var5;
		var11.field484 += var11.field492 * var5;
		var11.field488 = var6;
		var11.field480 = var4;
		return var5;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbv;II)I"
	)
	static int method962(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field488 -= var5 * var13.field490;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field488 += var13.field490 * var5;
		var13.field483 = var6;
		var13.field484 = var7;
		var13.field480 = var4;
		return var5;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbv;II)I"
	)
	static int method856(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field483 -= var11.field491 * var5;
		var11.field484 -= var11.field492 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field483 += var11.field491 * var5;
		var11.field484 += var11.field492 * var5;
		var11.field488 = var6;
		var11.field480 = var4;
		return var5;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbv;II)I"
	)
	static int method917(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field488 -= var5 * var13.field490;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field488 += var13.field490 * var5;
		var13.field483 = var6;
		var13.field484 = var7;
		var13.field480 = var4;
		return var5;
	}
}
